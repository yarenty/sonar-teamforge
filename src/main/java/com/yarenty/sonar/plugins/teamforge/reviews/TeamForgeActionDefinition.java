/*
 * Sonar-TeamForge Plugin
 * Copyright (C) 2014 YarentY 
 * yarenty@gmail.com
 */
package com.yarenty.sonar.plugins.teamforge.reviews;

import org.sonar.api.ServerExtension;
import org.sonar.api.issue.action.Actions;
import org.sonar.api.issue.condition.HasIssuePropertyCondition;
import org.sonar.api.issue.condition.IsUnResolved;
import org.sonar.api.issue.condition.NotCondition;

import com.yarenty.sonar.plugins.teamforge.TeamForgeConstants;

public final class TeamForgeActionDefinition implements ServerExtension {

	private static final String LINK_TO_TF_ID = "link-to-teamforge";
	private final Actions actions;
	private final LinkFunction linkFunction;

	public TeamForgeActionDefinition(Actions actions, LinkFunction linkFunction) {
		this.actions = actions;
		this.linkFunction = linkFunction;
	}

	public void start() {
		actions.add(LINK_TO_TF_ID)
				.setConditions(
						new NotCondition(
								new HasIssuePropertyCondition(
										TeamForgeConstants.SONAR_ISSUE_DATA_PROPERTY_KEY)),
						new IsUnResolved()).setFunctions(linkFunction);
	}
}
