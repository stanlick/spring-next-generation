package com.test.president;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;



@Named
public class Citizen {
	
	
	
	@Inject()
	@Qualifier("proxyBarackObama")
	private President president;
	
	public void askQuestion(){
		System.out.println(president.answerQuestion("What is your real name?"));
	}
	

}
