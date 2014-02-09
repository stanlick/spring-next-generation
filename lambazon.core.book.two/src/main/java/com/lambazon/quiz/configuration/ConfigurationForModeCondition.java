package com.lambazon.quiz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { ConfigurationForModeConditionDevelopment.class,
		ConfigurationForModeConditionProduction.class })
public class ConfigurationForModeCondition {

	@Bean
	@OperatingMode(MachineMode.Unknown)
	public MachineMode unknown() {
		return MachineMode.Unknown;
	}

	@Bean
	@OperatingMode(MachineMode.Development)
	public MachineMode dev() {
		return MachineMode.Development;
	}

	@Bean
	@OperatingMode(MachineMode.Test)
	public MachineMode test() {
		return MachineMode.Test;
	}

	@Bean
	@OperatingMode(MachineMode.Production)
	public MachineMode prod() {
		return MachineMode.Production;
	}

}
