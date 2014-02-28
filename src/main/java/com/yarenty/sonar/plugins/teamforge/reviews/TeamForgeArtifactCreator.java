/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */
package com.yarenty.sonar.plugins.teamforge.reviews;

//import com.atlassian.jira.rpc.soap.client.JiraSoapService;
//import com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
//import com.atlassian.jira.rpc.soap.client.RemoteComponent;
//import com.atlassian.jira.rpc.soap.client.RemoteIssue;
//import com.atlassian.jira.rpc.soap.client.RemotePermissionException;
//import com.atlassian.jira.rpc.soap.client.RemoteValidationException;
import org.apache.commons.lang.StringUtils;
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
import com.collabnet.ce.webservices.CTFDocumentFolder;
import com.collabnet.ce.webservices.CTFProject;
import com.collabnet.ce.webservices.CTFTracker;
import com.collabnet.ce.webservices.CollabNetApp;
import com.yarenty.sonar.plugins.teamforge.TeamForgeConstants;
//import org.sonar.plugins.jira.soap.JiraSoapSession;






import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

/**
 * SOAP client class that is used for creating issues on a JIRA server
 */
@Properties({
  @Property(
    key = TeamForgeConstants.TEAMFORGE_PROJECT_NAME,
    defaultValue = "",
    name = "TeamForge Project Name",
    description = "Your project name",
    global = true,
    project = true
  ),
  @Property(
    key = TeamForgeConstants.TEAMFORGE_INFO_PRIORITY_ID,
    defaultValue = "5",
    name = "TeamForge priority id for INFO",
    description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity INFO. Default is 5 (Trivial).",
    global = true,
    project = true,
    type = PropertyType.INTEGER
  ),
  @Property(
    key = TeamForgeConstants.TEAMFORGE_MINOR_PRIORITY_ID,
    defaultValue = "4",
    name = "TeamForge priority id for MINOR",
    description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity MINOR. Default is 4 (Minor).",
    global = true,
    project = true,
    type = PropertyType.INTEGER
  ),
  @Property(
    key = TeamForgeConstants.TEAMFORGE_MAJOR_PRIORITY_ID,
    defaultValue = "3",
    name = "TeamForge priority id for MAJOR",
    description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity MAJOR. Default is 3 (Major).",
    global = true,
    project = true,
    type = PropertyType.INTEGER
  ),
  @Property(
    key = TeamForgeConstants.TEAMFORGE_CRITICAL_PRIORITY_ID,
    defaultValue = "2",
    name = "TeamForge priority id for CRITICAL",
    description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity CRITICAL. Default is 2 (Critical).",
    global = true,
    project = true,
    type = PropertyType.INTEGER
  ),
  @Property(
    key = TeamForgeConstants.TEAMFORGE_BLOCKER_PRIORITY_ID,
    defaultValue = "1",
    name = "TeamForge priority id for BLOCKER",
    description = "TeamForge priority id used to create TeamForge artifacts for SonarQube issues with severity BLOCKER. Default is 1 (Blocker).",
    global = true,
    project = true,
    type = PropertyType.INTEGER
  ),
  @Property(
    key = TeamForgeConstants.TEAMFORGE_TRACKER_NAME,
    defaultValue = TeamForgeConstants.TEAMFORGE_TRACKER_NAME_DEF,
    name = "TeamForge tracker name",
    description = "TeamForge tracker name used to create TeamForge artifacts for SonarQube issues. Default is Task (a default TeamForge installation).",
    global = true,
    project = true
  )
})
public class TeamForgeArtifactCreator implements ServerExtension {

  private static final String QUOTE = "\n{quote}\n";
  private static final Logger LOG = LoggerFactory.getLogger(TeamForgeArtifactCreator.class);
  private final RuleFinder ruleFinder;

  public TeamForgeArtifactCreator(RuleFinder ruleFinder) {
    this.ruleFinder = ruleFinder;
  }

  public CTFArtifact createArtifact(Issue sonarIssue, Settings settings) throws RemoteException {

	    String url = settings.getString(TeamForgeConstants.SERVER_URL_PROPERTY);
	    String username = settings.getString(TeamForgeConstants.USERNAME_PROPERTY);
	    String password = settings.getString(TeamForgeConstants.PASSWORD_PROPERTY);
	    String project = settings.getString(TeamForgeConstants.TEAMFORGE_PROJECT_NAME);
	    String tracker = settings.getString(TeamForgeConstants.TEAMFORGE_TRACKER_NAME);
	    
	    
		LOG.info("URL::"+url);
		LOG.info("username::"+username);
		LOG.info("password::"+password);
		LOG.info("Connecting to:"+project);
		LOG.info("tracker::"+tracker);
		LOG.info("title::"+ generateIssueSummary(sonarIssue));
		LOG.info("desc::"+generateIssueDescription(sonarIssue, settings));
		LOG.info("priority::"+sonarSeverityToTFPriorityId(RulePriority.valueOf(sonarIssue.severity()),settings));
		
		
		
	CollabNetApp cna;

		LOG.debug("URL::"+url);
		LOG.debug("username::"+username);
		LOG.debug("password::"+password);

		cna = new CollabNetApp(url, username, password);

	CTFArtifact artifact = null;
		LOG.debug("Connecting to:"+project);
		
		// CTFProject p = cna.getProjectById("proj1552");
		CTFProject p = cna.getProjectByTitle(project);

		System.out.println("=>>>>>>>>> "+project+"!!!!");

		System.out.println("=>>>>>>>>> GCE!!!! TRACKERS:");

		List<CTFTracker> ctfTrackers = p.getTrackers();
		for (CTFTracker t : ctfTrackers) {
			System.out.println(t.getId() + "==" + t.getTitle());
			
			if (t.getTitle().equals(tracker)) {
				 artifact = t.createArtifact(
						 generateIssueSummary(sonarIssue),
						 generateIssueDescription(sonarIssue, settings),
						null,
						null,
						"New", 
						null, 
						sonarSeverityToTFPriorityId(RulePriority.valueOf(sonarIssue.severity()),settings)
						, 0, null, null, null, null,
						null, null);

				System.out.println("CREATED!!:" + artifact.getId() + ">>"
						+ artifact.getTitle() + "\n Decription:" +
						artifact.getDescription() +"\n url=" + artifact.getURL()
						+ " path=" + artifact.getPath() + " by "
						+ artifact.getCreatedBy());
			}
		}


	
	return artifact;
  }
  
  

 
  protected CTFArtifact sendRequest(CollabNetApp jiraSoapService, String jiraUrl, String userName) {
    try {
    	CTFProject project = jiraSoapService.getProjectById("1");
    	CTFTracker tracker =  project.createTracker("name", "title", "description");
    	CTFArtifact artifact = tracker.createArtifact("title",
    			"description", 
    			"group",
    			"category",
    			"status",
    			"customer",
    			0,
    			0,
    			"assignTo",
    			"releaseId",
    			null,
    			"fileName",
    			"fileMimeType"
    			, null);
    	
      return artifact;
    } catch (RemoteException e) {
      throw new IllegalStateException("Impossible to create the issue on the TEAMFORGE server (" + jiraUrl + ")", e);
    }
  }



  protected String generateIssueSummary(Issue sonarIssue) {
    Rule rule = ruleFinder.findByKey(sonarIssue.ruleKey());

    StringBuilder summary = new StringBuilder("SonarQube Issue #");
    summary.append(sonarIssue.key());
    if (rule != null && rule.getName() != null) {
      summary.append(" - ");
      summary.append(rule.getName().toString());
    }
    return summary.toString();
  }

  protected String generateIssueDescription(Issue sonarIssue, Settings settings) {
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

  protected int sonarSeverityToTFPriorityId(RulePriority reviewSeverity, Settings settings) {
    final int priorityId;
    switch (reviewSeverity) {
      case INFO:
        priorityId = settings.getInt(TeamForgeConstants.TEAMFORGE_INFO_PRIORITY_ID);
        break;
      case MINOR:
        priorityId = settings.getInt(TeamForgeConstants.TEAMFORGE_MINOR_PRIORITY_ID);
        break;
      case MAJOR:
        priorityId = settings.getInt(TeamForgeConstants.TEAMFORGE_MAJOR_PRIORITY_ID);
        break;
      case CRITICAL:
        priorityId = settings.getInt(TeamForgeConstants.TEAMFORGE_CRITICAL_PRIORITY_ID);
        break;
      case BLOCKER:
        priorityId = settings.getInt(TeamForgeConstants.TEAMFORGE_BLOCKER_PRIORITY_ID);
        break;
      default:
        throw new SonarException("Unable to convert review severity to TEAMFORGE priority: " + reviewSeverity);
    }
    return priorityId;
  }

}
