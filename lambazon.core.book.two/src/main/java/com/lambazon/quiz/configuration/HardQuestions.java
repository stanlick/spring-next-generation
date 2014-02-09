package com.lambazon.quiz.configuration;

import java.util.ArrayList;
import java.util.Collection;


public class HardQuestions extends Questions<Question>{

	{
		
		add(new Question(1, getQuestion(1),getAnswer(1)));
		add(new Question(1, getQuestion(1),getAnswer(1)));
		add(new Question(1, getQuestion(1),getAnswer(1)));
		add(new Question(1, getQuestion(1),getAnswer(1)));
		
		
	}

	private String getQuestion(int i) {
		return "What year was Spring introduced?";
	}

	private Collection<Answer> getAnswer(int i) {
		Collection<Answer> answers = new ArrayList<>();
		answers.add(new Answer(1, "1984"));
		answers.add(new Answer(1, "2000"));
		answers.add(new Answer(1, "2010"));
		answers.add(new Answer(1, "2004"));
		
		
		return answers;
	}

}
