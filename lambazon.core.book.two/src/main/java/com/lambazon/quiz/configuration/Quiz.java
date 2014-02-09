package com.lambazon.quiz.configuration;

import javax.inject.Inject;

public class Quiz {
	
	@Inject
	private String difficulty;
	
	@Inject
	private Questions questions;
	
	
	private void build(){	}
	private Grade grade(){return null;	}

	
	
	public String getDifficulty() {
		return difficulty;
	}
	public Questions getQuestions() {
		return questions;
	}
}
