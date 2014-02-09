package com.lambazon.annotated.domain;

import java.io.Serializable;

public class Carrier implements Serializable{
	
	private String name;
	
	public Carrier(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Carrier [name=" + name + "]";
	}

}
