package com.lambazon.domain;

import java.util.Collection;

public class Order {
	
	//properties
	private Customer customer;
	private Payment payment;
	private Address address;
	private Collection<Item> orderItems;

	//behaviors
	public void add(Item item){	}
	public void remove(Item item){ }
	public double total(){ return 0.0; }
}
