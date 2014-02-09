package com.lambazon.annotated.domain;

import javax.persistence.Entity;

import com.lambazon.domain.Address;
import com.lambazon.domain.Status;



@Entity
public class Customer extends BaseEntity{

	private static final long serialVersionUID = 743407859118764332L;
	private Name name;
	private Status status = Status.unset;
	private Address address;
	private OrderHistory orderHistory = null;

	private void determinePurchaseStatus() {
		status = orderHistory.determineStatus(this);
	}

	public void setOrderHistory(OrderHistory orderHistory) {
		this.orderHistory = orderHistory;
	}

	public Object getStatus() {
		return status;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public OrderHistory getOrderHistory() {
		return orderHistory;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", status=" + status + ", address="
				+ address + ", orderHistory=" + orderHistory + "]";
	}

}
