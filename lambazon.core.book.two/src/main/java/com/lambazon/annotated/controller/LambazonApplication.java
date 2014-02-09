package com.lambazon.annotated.controller;

import javax.inject.Inject;
import javax.inject.Named;

import com.lambazon.annotated.domain.Customer;
import com.lambazon.annotated.domain.Order;
import com.lambazon.controller.Controller;
import com.lambazon.domain.dsl.Weekday;
import com.lambazon.domain.dsl.Weekend;

@Named	
public class LambazonApplication {
	
	@Inject
	@Weekday
	private Controller<Order> orderController;
	
	@Inject
	@Weekend
	private Controller<Order> weekendOrderController;
	
	@Inject
	private Controller<Customer> customerController;
	
	public Controller<Order> getOrderController() {
		return orderController;
	}

	public Controller<Order> getWeekendOrderController() {
		return weekendOrderController;
	}

	public Controller<Customer> getCustomerController() {
		return customerController;
	}



	


	
	
	
}
