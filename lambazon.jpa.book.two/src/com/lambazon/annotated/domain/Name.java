package com.lambazon.annotated.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Name implements Serializable{
	
	private static final long serialVersionUID = -4288276017042021788L;
	private String fName, mName, lName;

	public Name() {}
	public Name(String first,String middle,String last) {
		setFirst(first);
		setMiddle(middle);
		setLast(last);
	}

	public String getFirst() {
		return fName;
	}

	public void setFirst(String first) {
		this.fName = first;
	}

	public String getMiddle() {
		return mName;
	}

	public void setMiddle(String middle) {
		this.mName = middle;
	}

	public String getLast() {
		return lName;
	}

	public void setLast(String last) {
		this.lName = last;
	}
	@Override
	public String toString() {
		return "Name [fName=" + fName + ", mName=" + mName + ", lName=" + lName
				+ "]";
	}

}
