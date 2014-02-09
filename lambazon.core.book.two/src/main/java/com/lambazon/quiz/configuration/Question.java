package com.lambazon.quiz.configuration;

import java.util.Collection;

public class Question {
	
	private Integer id;
	private String question;
	private Collection<Answer> answers;
	
	public Question(Integer id, String question, Collection<Answer> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}

}
