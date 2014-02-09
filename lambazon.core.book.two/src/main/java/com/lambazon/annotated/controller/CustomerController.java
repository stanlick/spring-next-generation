package com.lambazon.annotated.controller;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Lazy;

import com.lambazon.annotated.domain.Customer;
import com.lambazon.controller.Controller;
import com.lambazon.domain.Criteria;
import com.lambazon.domain.dsl.Weekend;
import com.lambazon.service.Service;





@Named
@Weekend
public class CustomerController implements Controller<Customer>{

	@Inject
	private Service<Customer> service;


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

	@Override
	public String toString() {
		return "CustomerController [service=" + service + "]";
	}

}
