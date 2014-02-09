package com.lambazon.domain;

import javax.annotation.PostConstruct;

public class Bar {
	
	private Baz baz;
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("inside Bar postConstruct()");
	}

}
