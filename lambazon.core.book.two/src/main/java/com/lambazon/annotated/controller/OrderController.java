package com.lambazon.annotated.controller;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import com.lambazon.annotated.domain.Customer;
import com.lambazon.annotated.domain.Order;
import com.lambazon.controller.Controller;
import com.lambazon.domain.Criteria;
import com.lambazon.domain.dsl.Weekday;
import com.lambazon.service.Service;

@Named
@Weekday
public class OrderController implements Controller<Order>{

	@Inject
	private Service<Order> service;


	public Order get(int id) {
		return service.get(id);
	}

	public Collection<Order> getAll(Class<Order> t) {
		return service.getAll(t);
	}
	public Collection<Order> getFiltered(Class<Order> t, Criteria criteria) {
		return service.getFiltered(t, criteria);
	}

	public Order save(Order t) {
		return service.save(t);
	}

	public Order remove(Order t) {
		return service.remove(t);
	}

}
