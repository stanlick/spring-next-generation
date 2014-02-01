package com.lambazon.controller;

import java.util.Collection;

import com.lambazon.domain.Criteria;
import com.lambazon.domain.Customer;
import com.lambazon.service.CustomerService;
import com.lambazon.service.Service;

public class CustomerController implements Controller<Customer>{
	
	private Service<Customer> service = new CustomerService();

	public Customer get(int id) {
		return service.get(id);
	}

	public Collection<Customer> getAll(Class<Customer> t) {
		return service.getAll(t);
	}

	public Collection<Customer> getFiltered(Class<Customer> t, Criteria criteria) {
		return service.getFiltered(t, criteria);
	}

	public Customer save(Customer t) {
		return service.save(t);
	}

	public Customer remove(Customer t) {
		return service.remove(t);
	}

}
