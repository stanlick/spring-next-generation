package com.lambazon.quiz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OperatingMode(MachineMode.Development)
public class ConfigurationForModeConditionDevelopment {

	@Bean
	public String foo() {
		return "development foo";
	}
	@Bean
	public String bar() {
		return "development bar";
	}
	@Bean
	public String baz() {
		return "development baz";
	}
}
