/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */
package com.yarenty.sonar.plugins.teamforge.reviews;

import org.junit.Test;
import org.sonar.api.issue.action.Action;
import org.sonar.api.issue.action.Actions;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class TeamForgeActionDefinitionTest {

  @Test
  public void givenAction_whenStart_thenLinkExist() throws Exception {
    Actions actions = new Actions();
    LinkFunction function = mock(LinkFunction.class);

    TeamForgeActionDefinition builder = new TeamForgeActionDefinition(actions, function);
    builder.start();

    Action action = actions.list().get(0);
    assertThat(action.key()).isEqualTo("link-to-teamforge");
    assertThat(action.functions().get(0)).isEqualTo(function);
    assertThat(action.conditions()).isNotEmpty();
  }

}
