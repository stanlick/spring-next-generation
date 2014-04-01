package com.test.president;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ProxyBarackObama implements President{

	@Inject
	private BarackObama realPresident;
	
	public String answerQuestion(String question) {
		return "what you want to hear";
	}

}
