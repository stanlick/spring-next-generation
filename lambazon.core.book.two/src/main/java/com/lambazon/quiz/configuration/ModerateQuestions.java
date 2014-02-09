package com.lambazon.quiz.configuration;

import java.util.ArrayList;
import java.util.Collection;


public class ModerateQuestions extends Questions<Question>{

	{
		
		add(new Question(1, getQuestion(1),getAnswer(1)));
		add(new Question(1, getQuestion(1),getAnswer(1)));
		add(new Question(1, getQuestion(1),getAnswer(1)));
		
		
	}

	private String getQuestion(int i) {
		return "What Java keyword is Spring trying to remove from your coding?";
	}

	private Collection<Answer> getAnswer(int i) {
		Collection<Answer> answers = new ArrayList<>();
		answers.add(new Answer(1, "final"));
		answers.add(new Answer(1, "new"));
		answers.add(new Answer(1, "old"));
		
		
		return answers;
	}

}
