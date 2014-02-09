package com.lambazon.domain;



public class CustomerWithConstructorInject {

	private OrderHistory orderHistory;

	public CustomerWithConstructorInject(OrderHistory orderHistory) {
		this.orderHistory = orderHistory;
	}
	public OrderHistory getOrderHistory() {
		return orderHistory;
	}	

}
