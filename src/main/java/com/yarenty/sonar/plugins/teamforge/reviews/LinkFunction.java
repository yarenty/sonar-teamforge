/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */
package com.yarenty.sonar.plugins.teamforge.reviews;

import com.collabnet.ce.webservices.CTFArtifact;
import com.google.common.annotations.VisibleForTesting;

import org.sonar.api.ServerExtension;
import org.sonar.api.config.Settings;
import org.sonar.api.issue.action.Function;

import com.yarenty.sonar.plugins.teamforge.TeamForgeConstants;

import java.rmi.RemoteException;

public class LinkFunction implements Function, ServerExtension {

  private final TeamForgeArtifactCreator tfArtifactCreator;

  public LinkFunction(TeamForgeArtifactCreator tfArtifactCreator) {
    this.tfArtifactCreator = tfArtifactCreator;
  }

  public void execute(Context context) {
    checkConditions(context.projectSettings());
    createTeamForgeArtifact(context);
  }

  protected void createTeamForgeArtifact(Context context) {
	CTFArtifact artifact;
    try {
      artifact = tfArtifactCreator.createArtifact(context.issue(), context.projectSettings());
    } catch (RemoteException e) {
      throw new IllegalStateException("Impossible to create an artifact on TeamForge. A problem occured with the remote server: " + e.getMessage(), e);
    }

    createComment(artifact, context);
    // and add the property
    context.setAttribute(TeamForgeConstants.SONAR_ISSUE_DATA_PROPERTY_KEY, artifact.getId());
  }

  @VisibleForTesting
  void checkConditions(Settings settings) {
    checkProperty(TeamForgeConstants.SERVER_URL_PROPERTY, settings);
    
    checkProperty(TeamForgeConstants.USERNAME_PROPERTY, settings);
    checkProperty(TeamForgeConstants.PASSWORD_PROPERTY, settings);
    
    checkProperty(TeamForgeConstants.TEAMFORGE_PROJECT_NAME, settings);
    checkProperty(TeamForgeConstants.TEAMFORGE_TRACKER_NAME, settings);
    
    checkProperty(TeamForgeConstants.TEAMFORGE_CRITICAL_PRIORITY_ID, settings);
    checkProperty(TeamForgeConstants.TEAMFORGE_BLOCKER_PRIORITY_ID, settings);
    checkProperty(TeamForgeConstants.TEAMFORGE_MAJOR_PRIORITY_ID, settings);
    checkProperty(TeamForgeConstants.TEAMFORGE_INFO_PRIORITY_ID, settings);
    checkProperty(TeamForgeConstants.TEAMFORGE_MINOR_PRIORITY_ID, settings);
    
  }

  private void checkProperty(String property, Settings settings) {
    if (!settings.hasKey(property) && !settings.hasDefaultValue(property)) {
      throw new IllegalStateException("The TeamForge property \"" + property + "\" must be defined before you can use the \"Link to TeamForge\" button");
    }
  }

  protected void createComment(CTFArtifact artifact, Context context) {
    context.addComment(generateCommentText(artifact, context));
  }

  protected String generateCommentText(CTFArtifact artifact, Context context) {
    StringBuilder message = new StringBuilder();
    message.append("Issue linked to TeamForge artifact: ");
    message.append(context.projectSettings().getString(TeamForgeConstants.SERVER_URL_PROPERTY));
    message.append("/browse/"); //TODO: CHANGE LINK!!!
    message.append(artifact.getId());
    return message.toString();
  }

}
