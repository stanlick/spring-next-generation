package com.lambazon.quiz.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

public class ModeCondition implements Condition {

	protected static final Log logger = LogFactory.getLog(ModeCondition.class);

	@Override
	public boolean matches(ConditionContext context,
			AnnotatedTypeMetadata metadata) {

		MultiValueMap<String, Object> attrs = metadata
				.getAllAnnotationAttributes(OperatingMode.class.getName());

		if (attrs != null) {
			for (Object value : attrs.get("value")) {
				MachineMode[] mode = (MachineMode[]) value;
				for (MachineMode m : mode) {
					if (m==CurrentSystemMode.currentMode) {
						logger.debug(m.name() + " registered.");
						return true;
					} else {
						logger.debug(m.name() + " NOT registered because system is currently in mode " + CurrentSystemMode.currentMode);
						return false;
					}
				}
			}
		}
		return false;
	}
}
