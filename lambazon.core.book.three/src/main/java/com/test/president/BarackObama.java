package com.test.president;

import javax.inject.Named;

@Named
public class BarackObama implements President{

	public String answerQuestion(String question) {
		return "what you want to hear";
	}

}
