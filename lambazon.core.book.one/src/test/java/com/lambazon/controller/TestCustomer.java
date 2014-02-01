package com.lambazon.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lambazon.domain.Customer;
import com.lambazon.domain.Name;
import com.lambazon.domain.Status;

public class TestCustomer {
	
	@Test
	public void cloudSourceTest() {
		Customer customer = new Customer();
		customer.setName(new Name("J", "Scott", "Stanlick"));
		CustomerController controller = new CustomerController();
		customer = controller.get(12345);
		assertNotNull("Customer id should not be null", customer.getId());
	}

}
