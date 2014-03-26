/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */
package com.yarenty.sonar.plugins.teamforge.reviews;

import org.apache.axis.AxisFault;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.sonar.api.CoreProperties;
import org.sonar.api.config.Settings;
import org.sonar.api.issue.Issue;
import org.sonar.api.issue.internal.DefaultIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.rules.RuleFinder;
import org.sonar.api.rules.RulePriority;

import com.collabnet.ce.soap50.types.SoapFieldValues;
import com.collabnet.ce.webservices.CTFArtifact;
import com.collabnet.ce.webservices.CTFFile;
import com.collabnet.ce.webservices.CTFList;
import com.collabnet.ce.webservices.CTFProject;
import com.collabnet.ce.webservices.CTFTracker;
import com.collabnet.ce.webservices.CollabNetApp;
import com.yarenty.sonar.plugins.teamforge.TeamForgeConstants;

import java.rmi.RemoteException;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

/**
 * TeamForge Artifact creator tests.
 * @author yarenty
 */
public class TeamForgeArtifactCreatorTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  private TeamForgeArtifactCreator tfArtifactCreator;
  private Issue sonarIssue;
  private Settings settings;
  private RuleFinder ruleFinder;
  private CollabNetApp cna;
  private CTFProject project;

  @Before
  public void init() throws Exception {
    sonarIssue = new DefaultIssue()
      .setKey("ABCD")
      .setMessage("The Cyclomatic Complexity of this method is 14 which is greater than 10 authorized.")
      .setSeverity("MINOR")
      .setRuleKey(RuleKey.of("squid", "CycleBetweenPackages"));

    ruleFinder = mock(RuleFinder.class);
    when(ruleFinder.findByKey(RuleKey.of("squid", "CycleBetweenPackages")))
    	.thenReturn(org.sonar.api.rules.Rule.create().setName(
    			"Avoid cycle between java packages"));

    settings = new Settings(); //new PropertyDefinitions(TeamForgeArtifactCreator.class, TeamforgePlugin.class));
   
    settings.setProperty(CoreProperties.SERVER_BASE_URL, "http://www.yarenty.com");
    settings.setProperty(TeamForgeConstants.SERVER_URL_PROPERTY, "http://www.yarenty.com");
    settings.setProperty(TeamForgeConstants.USERNAME_PROPERTY, "john");
    settings.setProperty(TeamForgeConstants.PASSWORD_PROPERTY, "1234");
    settings.setProperty(TeamForgeConstants.TEAMFORGE_PROJECT_NAME, "SONAR");
    settings.setProperty(TeamForgeConstants.TEAMFORGE_INFO_PRIORITY_ID, 5);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_MINOR_PRIORITY_ID, 4);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_MAJOR_PRIORITY_ID, 3);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_CRITICAL_PRIORITY_ID, 2);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_BLOCKER_PRIORITY_ID, 1);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_TRACKER_NAME, "teamforge.tracker.name");
    settings.setProperty(TeamForgeConstants.TEAMFORGE_TRACKER_NAME_DEF, "Task");
    
    tfArtifactCreator =  spy( new TeamForgeArtifactCreator(ruleFinder));
    
  }

  @Test (expected = AxisFault.class)
  public void shouldCreateCollabNetConnection() throws Exception {
	 //assumption: there are no server named http://my.server
    tfArtifactCreator.connect(settings);
  }

  
  

 
  @Test(expected = RemoteException.class)
  public void shouldFailToCreateConnectionWithIncorrectUrl() throws Exception {
    settings.removeProperty(TeamForgeConstants.SERVER_URL_PROPERTY);
    settings.appendProperty(TeamForgeConstants.SERVER_URL_PROPERTY, "my.server");

    tfArtifactCreator.connect(settings);
  }

  

  @Test
  public void shouldCreateIssue() throws Exception {
    // Given that
    cna = mock (CollabNetApp.class);    
    project = mock(CTFProject.class);
    CTFList ctfTrackers = new CTFList();
	CTFTracker tracker= mock(CTFTracker.class);
	ctfTrackers.add(tracker);
	CTFArtifact artifact = mock(CTFArtifact.class);
	
	
    when(cna.getProjectByTitle("SONAR")).thenReturn(project);
    when(project.getTrackers()).thenReturn(ctfTrackers);
    when(tracker.getTitle()).thenReturn("teamforge.tracker.name");
    doReturn(artifact).when(tracker).createArtifact(
    		anyString(),anyString(),
    		anyString(),
    		anyString(),
			anyString(),
			anyString(),
			anyInt(), anyInt(), anyString(), anyString(), 
			(SoapFieldValues)anyObject(),
			anyString(),anyString(),
			(CTFFile)anyObject());
    when(artifact.getId()).thenReturn("666");
    doReturn(cna).when(tfArtifactCreator).connect(settings);
    //when(tfArtifactCreator.connect(settings)).thenReturn(cna);
       

    // Verify
    CTFArtifact returnedIssue = tfArtifactCreator.createArtifact(sonarIssue, settings);

    assertThat(returnedIssue.getId()).isEqualTo("666");
  }

 
  @Test
  public void shouldGiveDefaultDescription() throws Exception {
    // Verify
	  assertThat(tfArtifactCreator.generateIssueDescription(sonarIssue, settings))
		  .isEqualTo("Issue detail:\n{quote}\nThe Cyclomatic Complexity of this method is 14 which is greater than 10 authorized.\n" +
	    	      "{quote}\n\n\nCheck it on SonarQube: http://www.yarenty.com/issue/show/ABCD\n");
  }  

  @Test
  public void shouldGiveDefaultSummary() throws Exception {
    assertThat(tfArtifactCreator.generateIssueSummary(sonarIssue))
    .isEqualTo("SonarQube Issue - Avoid cycle between java packages (#ABCD)");
 

  }
  
  
  @Test
  public void shouldGiveDefaultPriority() throws Exception {
    assertThat(tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.BLOCKER, settings)).isEqualTo(1);
    assertThat(tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.CRITICAL, settings)).isEqualTo(2);
    assertThat(tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.MAJOR, settings)).isEqualTo(3);
    assertThat(tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.MINOR, settings)).isEqualTo(4);
    assertThat(tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.INFO, settings)).isEqualTo(5);
  }
  
  
  @Test
  public void checkTeamForgePriotityIdForSeverityBLOCKER() {
	
	  assertEquals("Sonar severity BLOCKER should be 1",1, 
			  tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.BLOCKER, settings));
  }
  
  @Test
  public void checkTeamForgePriotityIdForSeverityCRITICAL() {
	
	  assertEquals("Sonar severity CRITICAL should be 2",2, 
			  tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.CRITICAL, settings));
  }

  @Test
  public void checkTeamForgePriotityIdForSeverityMAJOR() {
	
	  assertEquals("Sonar severity MAJOR should be 3",3, 
			  tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.MAJOR, settings));
  }
  
  @Test
  public void checkTeamForgePriotityIdForSeverityMINOR() {
	
	  assertEquals("Sonar severity MINOR should be 4",4, 
			  tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.MINOR, settings));
  }
  
  @Test
  public void checkTeamForgePriotityIdForSeverityINFO() {
	
	  assertEquals("Sonar severity INFO should be 5",5, 
			  tfArtifactCreator.sonarSeverityToTFPriorityId(RulePriority.INFO, settings));
  }
  
}
