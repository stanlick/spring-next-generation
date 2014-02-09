package com.lambazon.quiz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OperatingMode(MachineMode.Production)
public class ConfigurationForModeConditionProduction {

	@Bean
	public String foo() {
		return "production foo";
	}
	@Bean
	public String bar() {
		return "production bar";
	}
	@Bean
	public String baz() {
		return "production baz";
	}
}
