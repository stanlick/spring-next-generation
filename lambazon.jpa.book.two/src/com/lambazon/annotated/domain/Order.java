package com.lambazon.annotated.domain;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;

@Entity
public class Order extends BaseEntity {

	// properties
	private Customer customer;
	private Shipping shipping;

	// behaviors
	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	@PostConstruct
	public void applyRules() {
		System.out.println("Inside Order.applyRules()");
		RulesEngine.process(this);		
	}
}
