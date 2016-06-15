/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */
package com.yarenty.sonar.plugins.teamforge.reviews;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.sonar.api.config.Settings;
import org.sonar.api.issue.Issue;
import org.sonar.api.issue.action.Function;
import org.sonar.api.issue.internal.DefaultIssue;

import com.collabnet.ce.webservices.CTFArtifact;
import com.collabnet.ce.webservices.CTFProject;
import com.collabnet.ce.webservices.CollabNetApp;
import com.yarenty.sonar.plugins.teamforge.TeamForgeConstants;

import java.rmi.RemoteException;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class LinkFunctionTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  private LinkFunction function;
  private TeamForgeArtifactCreator tfArtifactCreator;
  private Issue sonarIssue;
  private Function.Context context;
  private CTFArtifact artifact;
  private Settings settings;
  private CollabNetApp cna;
  private CTFProject project;

  @Before
  public void init() throws Exception {
    sonarIssue = new DefaultIssue().setKey("ABCD");
    settings = new Settings();

    context = mock(Function.Context.class);
    when(context.issue()).thenReturn(sonarIssue);
    when(context.projectSettings()).thenReturn(settings);

    tfArtifactCreator = mock(TeamForgeArtifactCreator.class);
    
   // cna = mock (CollabNetApp.class);
    
   // project = mock(CTFProject.class);
   // when(cna.getProjectByTitle("SONAR")).thenReturn(project);
    
    artifact = mock(CTFArtifact.class);
    artifact.setTitle("FOO-15");
    artifact.getURL();
    when(artifact.getId()).thenReturn("666");
    when(artifact.getDescription()).thenReturn("Test artifact");
    when(artifact.getURL()).thenReturn("http://test.url");
    
    when(tfArtifactCreator.createArtifact(sonarIssue, settings)).thenReturn(artifact);

    function = new LinkFunction(tfArtifactCreator);
  }


  @Test(expected = IllegalStateException.class)
  public void givenArtifactCreator_whenRemoteException_thenThrowIllegalStateException() throws Exception { 
	  //TODO: why??
    when(tfArtifactCreator.createArtifact(sonarIssue, settings)).thenThrow(new RemoteException("Server Error"));

    function.createTeamForgeArtifact(context);
  }

  @Test
  public void givenLinkFunction_whenCreateComment_thenCommentAdded() throws Exception {
    function.createComment(artifact, context);

    verify(context).addComment("Issue linked to TeamForge artifact: 666 link: http://test.url");
  }
  
  @Test
  public void givenLinkFunction_whenGenerateCommentText_thenCommentFormatted() throws Exception {
	    artifact = mock(CTFArtifact.class);
	    artifact.setTitle("FOO-15");
	    artifact.getURL();
	    when(artifact.getId()).thenReturn("666");
	    when(artifact.getDescription()).thenReturn("Test artifact");
	    when(artifact.getURL()).thenReturn("http://test.url");
	    
	  String commentText = function.generateCommentText(artifact, context);
    assertThat(commentText).isEqualTo("Issue linked to TeamForge artifact: 666 link: http://test.url");
  }

  @Test
  public void givenLinkFunction_whenSetting_thenConditionsMeet() {
    settings.setProperty(TeamForgeConstants.SERVER_URL_PROPERTY, "http://my.server");
    settings.setProperty(TeamForgeConstants.USERNAME_PROPERTY, "john");
    settings.setProperty(TeamForgeConstants.PASSWORD_PROPERTY, "1234");
    settings.setProperty(TeamForgeConstants.TEAMFORGE_PROJECT_NAME, "SONAR");
    settings.setProperty(TeamForgeConstants.TEAMFORGE_INFO_PRIORITY_ID, 5);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_MINOR_PRIORITY_ID, 4);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_MAJOR_PRIORITY_ID, 3);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_CRITICAL_PRIORITY_ID, 2);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_BLOCKER_PRIORITY_ID, 1);
    settings.setProperty(TeamForgeConstants.TEAMFORGE_TRACKER_NAME, "teamforge.tracker.name");
    settings.setProperty(TeamForgeConstants.TEAMFORGE_TRACKER_NAME_DEF, "Tast");

    function.checkConditions(settings);
  }

  @Test(expected = IllegalStateException.class)
  public void givenLinkFunction_whenEmptySettings_thenThrowIllegalStateException() {
      function.checkConditions(settings);
  }

}
