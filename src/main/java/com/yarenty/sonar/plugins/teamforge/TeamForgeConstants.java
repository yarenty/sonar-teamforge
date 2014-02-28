/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */
package com.yarenty.sonar.plugins.teamforge;

public final class TeamForgeConstants {

	public static final String SONAR_ISSUE_DATA_PROPERTY_KEY = "teamforge-issue-key";

  // ===================== PLUGIN PROPERTIES =====================

  public static final String SERVER_URL_PROPERTY = "teamforge.url";

  public static final String TEAMFORGE_PROJECT_NAME = "temforge.project.name";
  public static final String TEAMFORGE_TRACKER_NAME = "teamforge.tracker.name";
  public static final String TEAMFORGE_TRACKER_NAME_DEF = "Task";

  public static final String USERNAME_PROPERTY = "teamforge.login.secured";
  public static final String PASSWORD_PROPERTY = "teamforge.password.secured";

  public static final String TEAMFORGE_INFO_PRIORITY_ID = "teamforge.info.priority.id";
  public static final String TEAMFORGE_MINOR_PRIORITY_ID = "teamforge.minor.priority.id";
  public static final String TEAMFORGE_MAJOR_PRIORITY_ID = "teamforge.major.priority.id";
  public static final String TEAMFORGE_CRITICAL_PRIORITY_ID = "teamforge.critical.priority.id";
  public static final String TEAMFORGE_BLOCKER_PRIORITY_ID = "teamforge.blocker.priority.id";


  private TeamForgeConstants() {
  }

}
