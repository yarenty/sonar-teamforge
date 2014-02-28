/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */

package com.yarenty.sonar.plugins.teamforge;

import com.google.common.collect.ImmutableList;
import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;
import com.yarenty.sonar.plugins.teamforge.reviews.TeamForgeActionDefinition;
import com.yarenty.sonar.plugins.teamforge.reviews.TeamForgeArtifactCreator;
import com.yarenty.sonar.plugins.teamforge.reviews.LinkFunction;

import java.util.List;

@Properties({
  @Property(
    key = TeamForgeConstants.SERVER_URL_PROPERTY,
    name = "TeamForge server URL",
    description = "Example : http://teamforge.com",
    global = true,
    project = true,
    module = false
  ),
  @Property(
    key = TeamForgeConstants.USERNAME_PROPERTY,
    defaultValue = "",
    name = "Username",
    global = true,
    project = true,
    module = false
  ),
  @Property(
    key = TeamForgeConstants.PASSWORD_PROPERTY,
    name = "Password",
    global = true,
    project = true,
    module = false
  )
})
public final class TeamforgePlugin extends SonarPlugin {

  public List getExtensions() {
    return ImmutableList.of(

      // issues part
      TeamForgeArtifactCreator.class, LinkFunction.class, TeamForgeActionDefinition.class
    );
  }
}
