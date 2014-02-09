package com.lambazon.quiz.configuration;

import java.util.ArrayList;
import java.util.Collection;


public class EasyQuestions extends Questions<Question>{

	{
		
		add(new Question(1, getQuestion(1),getAnswer(1)));
		add(new Question(1, getQuestion(1),getAnswer(1)));
		
		
	}

	private String getQuestion(int i) {
		return "How do you spell Spring?";
	}

	private Collection<Answer> getAnswer(int i) {
		Collection<Answer> answers = new ArrayList<>();
		answers.add(new Answer(1, "Spring"));
		answers.add(new Answer(1, "String"));
		
		
		return answers;
	}

}
