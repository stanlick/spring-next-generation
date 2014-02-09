package com.lambazon.annotated.domain;

public class RulesEngine {
	
	public static void process(Object o){
		System.out.println("Processing " + o.getClass().getName());
	}

}
