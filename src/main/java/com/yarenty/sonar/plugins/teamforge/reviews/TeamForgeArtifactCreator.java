/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */
package com.yarenty.sonar.plugins.teamforge.reviews;

import java.rmi.RemoteException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.CoreProperties;
import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.PropertyType;
import org.sonar.api.ServerExtension;
import org.sonar.api.config.Settings;
import org.sonar.api.issue.Issue;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleFinder;
import org.sonar.api.rules.RulePriority;
import org.sonar.api.utils.SonarException;

import com.collabnet.ce.webservices.CTFArtifact;
import com.collabnet.ce.webservices.CTFProject;
import com.collabnet.ce.webservices.CTFTracker;
import com.collabnet.ce.webservices.CollabNetApp;
import com.yarenty.sonar.plugins.teamforge.TeamForgeConstants;

/**
 * SOAP client class that is used for creating issues on a TeamForge server.
 */
@Properties({
		@Property(key = TeamForgeConstants.TEAMFORGE_PROJECT_NAME, defaultValue = "", name = "TeamForge Project Name", description = "Your project name", global = true, project = true),
		@Property(key = TeamForgeConstants.TEAMFORGE_INFO_PRIORITY_ID, defaultValue = "5", name = "TeamForge priority id for INFO", description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity INFO. Default is 5 (Trivial).", global = true, project = true, type = PropertyType.INTEGER),
		@Property(key = TeamForgeConstants.TEAMFORGE_MINOR_PRIORITY_ID, defaultValue = "4", name = "TeamForge priority id for MINOR", description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity MINOR. Default is 4 (Minor).", global = true, project = true, type = PropertyType.INTEGER),
		@Property(key = TeamForgeConstants.TEAMFORGE_MAJOR_PRIORITY_ID, defaultValue = "3", name = "TeamForge priority id for MAJOR", description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity MAJOR. Default is 3 (Major).", global = true, project = true, type = PropertyType.INTEGER),
		@Property(key = TeamForgeConstants.TEAMFORGE_CRITICAL_PRIORITY_ID, defaultValue = "2", name = "TeamForge priority id for CRITICAL", description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity CRITICAL. Default is 2 (Critical).", global = true, project = true, type = PropertyType.INTEGER),
		@Property(key = TeamForgeConstants.TEAMFORGE_BLOCKER_PRIORITY_ID, defaultValue = "1", name = "TeamForge priority id for BLOCKER", description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity BLOCKER. Default is 1 (Blocker).", global = true, project = true, type = PropertyType.INTEGER),
		@Property(key = TeamForgeConstants.TEAMFORGE_TRACKER_NAME, defaultValue = TeamForgeConstants.TEAMFORGE_TRACKER_NAME_DEF, name = "TeamForge tracker name", description = "TeamForge tracker name used to create TeamForge artifacts for SonarQube issues. Default is Task (a default TeamForge installation).", global = true, project = true) })
public class TeamForgeArtifactCreator implements ServerExtension {

	private static final String QUOTE = "\n{quote}\n";
	private static final Logger LOG = LoggerFactory
			.getLogger(TeamForgeArtifactCreator.class);
	private final RuleFinder ruleFinder;

	public TeamForgeArtifactCreator(final RuleFinder ruleFinder) {
		this.ruleFinder = ruleFinder;
	}

	/**
	 * Main function responsible for connecting sonar issue with teamforge
	 * artifact.
	 * 
	 * @param sonarIssue
	 * @param settings
	 * @return
	 * @throws RemoteException
	 */
	public CTFArtifact createArtifact(final Issue sonarIssue,
			final Settings settings) throws RemoteException {

		final CollabNetApp cna =  connect(settings);
		
		final String projectName = settings
				.getString(TeamForgeConstants.TEAMFORGE_PROJECT_NAME);
		final String trackerName = settings
				.getString(TeamForgeConstants.TEAMFORGE_TRACKER_NAME);
		

		if (LOG.isDebugEnabled()) {
			LOG.debug("project:" + projectName);
			LOG.debug("tracker::" + trackerName);
			LOG.debug("title::" + generateIssueSummary(sonarIssue));
			LOG.debug("desc::" + generateIssueDescription(sonarIssue, settings));
			LOG.debug("priority::"
					+ sonarSeverityToTFPriorityId(
							RulePriority.valueOf(sonarIssue.severity()),
							settings));
		}
		CTFArtifact artifact = null;

		final CTFProject project = cna.getProjectByTitle(projectName);

		final List<CTFTracker> ctfTrackers = project.getTrackers();
		
		for (final CTFTracker tracker : ctfTrackers) {
			if (tracker.getTitle().equals(trackerName)) {
				artifact = tracker.createArtifact(
						generateIssueSummary(sonarIssue),
						generateIssueDescription(sonarIssue, settings),
						null,
						null,
						"New",
						null,
						sonarSeverityToTFPriorityId(
								RulePriority.valueOf(sonarIssue.severity()),
								settings), 0, null, null, null, null, null,
						null);

				if (LOG.isDebugEnabled()) {
					LOG.debug("CREATED!!:" + artifact.getId() + ">>"
							+ artifact.getTitle() + "\n Decription:"
							+ artifact.getDescription() + "\n url="
							+ artifact.getURL() + " path=" + artifact.getPath()
							+ " by " + artifact.getCreatedBy());
				}
			}
		}

		return artifact;
	}


	/**
	 * Makes connection to teamforge instance.
	 * 
	 * @param settings
	 * @return
	 * @throws RemoteException
	 */
	protected CollabNetApp connect(final Settings settings) throws RemoteException {
		final String url = settings.getString(TeamForgeConstants.SERVER_URL_PROPERTY);
		final String username = settings
				.getString(TeamForgeConstants.USERNAME_PROPERTY);
		final String password = settings
				.getString(TeamForgeConstants.PASSWORD_PROPERTY);
		if (LOG.isDebugEnabled()) {
			LOG.debug("URL::" + url);
			// LOG.debug("username::" + username);
			// LOG.debug("password::" + password);
		}

		return new CollabNetApp(url, username, password);
	}
	

	/**
	 * Function responsible for generating summary description of sonar issue.
	 * Used as title!
	 * 
	 * @param sonarIssue
	 * @return
	 */
	protected String generateIssueSummary(final Issue sonarIssue) {
		final Rule rule = ruleFinder.findByKey(sonarIssue.ruleKey());

		final StringBuilder summary = new StringBuilder("SonarQube Issue");
		if (rule != null && rule.getName() != null) {
			summary.append(" - ");
			summary.append(rule.getName().toString());
		}
		summary.append(" (#");
		summary.append(sonarIssue.key());
		summary.append(')');
		return summary.toString();
	}

	/**
	 * Create detail description of sonar issue.
	 * 
	 * @param sonarIssue
	 * @param settings
	 * @return
	 */
	protected String generateIssueDescription(final Issue sonarIssue,
			final Settings settings) {
		//default description size..
		final StringBuilder description = new StringBuilder(500); 
		description.append("Issue detail:");
		description.append(QUOTE);
		description.append(sonarIssue.message());
		description.append(QUOTE);
		description.append("\n\nCheck it on SonarQube: ");
		description.append(settings.getString(CoreProperties.SERVER_BASE_URL));
		description.append("/issue/show/");
		description.append(sonarIssue.key());
		description.append('\n');
		return description.toString();
	}

	/**
	 * Conversion sonar severity to teamforge priority.
	 * 
	 * @param reviewSeverity
	 * @param settings
	 * @return
	 */
	protected int sonarSeverityToTFPriorityId(
			final RulePriority reviewSeverity, final Settings settings) {
		int priorityId;
		switch (reviewSeverity) {
		case INFO:
			priorityId = settings
					.getInt(TeamForgeConstants.TEAMFORGE_INFO_PRIORITY_ID);
			break;
		case MINOR:
			priorityId = settings
					.getInt(TeamForgeConstants.TEAMFORGE_MINOR_PRIORITY_ID);
			break;
		case MAJOR:
			priorityId = settings
					.getInt(TeamForgeConstants.TEAMFORGE_MAJOR_PRIORITY_ID);
			break;
		case CRITICAL:
			priorityId = settings
					.getInt(TeamForgeConstants.TEAMFORGE_CRITICAL_PRIORITY_ID);
			break;
		case BLOCKER:
			priorityId = settings
					.getInt(TeamForgeConstants.TEAMFORGE_BLOCKER_PRIORITY_ID);
			break;
		default:
			throw new SonarException(
					"Unable to convert review severity to TEAMFORGE priority: "
							+ reviewSeverity);
		}
		return priorityId;
	}

}
