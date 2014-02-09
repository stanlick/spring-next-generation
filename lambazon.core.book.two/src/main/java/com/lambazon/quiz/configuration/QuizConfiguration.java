package com.lambazon.quiz.configuration;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
public class QuizConfiguration {
	
	@Inject
	private Environment environment;
	
	@Bean
	public Quiz quiz(){
		return new Quiz();
	}
	
	@Bean
	public String difficulty(){
		return environment.getActiveProfiles()[0];
	}
	
	
	@Bean
	@Profile(Difficulty.easy)
	public Questions easyQuestions(){
		Questions<Question> questions = new EasyQuestions();
		return questions;
	}
	
	@Bean
	@Profile(Difficulty.moderate)
	public Questions moderateQuestions(){
		Questions<Question> questions = new ModerateQuestions();
		return questions;
	}
	
	@Bean
	@Profile(Difficulty.hard)
	public Questions hardQuestions(){
		Questions<Question> questions = new HardQuestions();
		return questions;
	}
	
		
}
