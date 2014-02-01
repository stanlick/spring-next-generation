package com.lambazon.domain;

import com.lambazon.factory.LambazonObjectFactory;

public class Customer {

	private Status status = Status.unset;
	private OrderHistory orderHistory = LambazonObjectFactory
			.get(OrderHistory.class);
	private Name name;
	private Integer id;

	public Customer() {
		determinePurchaseStatus();
	}

	private void determinePurchaseStatus() {
		status = orderHistory.determineStatus(this);
	}

	public Status getStatus() {
		return status;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;

	}
}
