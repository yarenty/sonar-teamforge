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
 * SOAP client class that is used for creating issues on a JIRA server
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

	public TeamForgeArtifactCreator(RuleFinder ruleFinder) {
		this.ruleFinder = ruleFinder;
	}

	public CTFArtifact createArtifact(Issue sonarIssue, Settings settings)
			throws RemoteException {

		String url = settings.getString(TeamForgeConstants.SERVER_URL_PROPERTY);
		String username = settings
				.getString(TeamForgeConstants.USERNAME_PROPERTY);
		String password = settings
				.getString(TeamForgeConstants.PASSWORD_PROPERTY);
		String project = settings
				.getString(TeamForgeConstants.TEAMFORGE_PROJECT_NAME);
		String tracker = settings
				.getString(TeamForgeConstants.TEAMFORGE_TRACKER_NAME);

		LOG.debug("URL::" + url);
		//LOG.debug("username::" + username);
		//LOG.debug("password::" + password);
		LOG.debug("project:" + project);
		LOG.debug("tracker::" + tracker);
		LOG.debug("title::" + generateIssueSummary(sonarIssue));
		LOG.debug("desc::" + generateIssueDescription(sonarIssue, settings));
		LOG.debug("priority::"
				+ sonarSeverityToTFPriorityId(
						RulePriority.valueOf(sonarIssue.severity()), settings));

		CollabNetApp cna;
		cna = new CollabNetApp(url, username, password);

		CTFArtifact artifact = null;

		// CTFProject p = cna.getProjectById("proj1552");
		CTFProject p = cna.getProjectByTitle(project);

		List<CTFTracker> ctfTrackers = p.getTrackers();
		for (CTFTracker t : ctfTrackers) {
			if (t.getTitle().equals(tracker)) {
				artifact = t.createArtifact(
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

				LOG.debug("CREATED!!:" + artifact.getId() + ">>"
						+ artifact.getTitle() + "\n Decription:"
						+ artifact.getDescription() + "\n url="
						+ artifact.getURL() + " path=" + artifact.getPath()
						+ " by " + artifact.getCreatedBy());
			}
		}

		return artifact;
	}


	protected String generateIssueSummary(Issue sonarIssue) {
		Rule rule = ruleFinder.findByKey(sonarIssue.ruleKey());

		StringBuilder summary = new StringBuilder("SonarQube Issue ");
		if (rule != null && rule.getName() != null) {
			summary.append(" - ");
			summary.append(rule.getName().toString());
		}
		summary.append(" (#");
		summary.append(sonarIssue.key());
		summary.append(")");
		return summary.toString();
	}

	protected String generateIssueDescription(Issue sonarIssue,
			Settings settings) {
		StringBuilder description = new StringBuilder("Issue detail:");
		description.append(QUOTE);
		description.append(sonarIssue.message());
		description.append(QUOTE);
		description.append("\n\nCheck it on SonarQube: ");
		description.append(settings.getString(CoreProperties.SERVER_BASE_URL));
		description.append("/issue/show/");
		description.append(sonarIssue.key());
		description.append("\n");
		return description.toString();
	}

	protected int sonarSeverityToTFPriorityId(RulePriority reviewSeverity,
			Settings settings) {
		final int priorityId;
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
