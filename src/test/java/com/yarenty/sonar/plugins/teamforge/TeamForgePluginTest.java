/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */

package com.yarenty.sonar.plugins.teamforge;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TeamForgePluginTest {
  @Test
  public void testGetExtensions() throws Exception {
    assertThat(new TeamforgePlugin().getExtensions().size()).isEqualTo(3);
  }
}
