package com.lambazon.annotated.service;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import com.lambazon.annotated.domain.Customer;
import com.lambazon.annotated.domain.Order;
import com.lambazon.repository.Repository;
import com.lambazon.domain.Criteria;
import com.lambazon.service.Service;


@Named
public class OrderService implements Service<Order> {

	@Inject
	private Repository<Order> repository;


	public Order get(int id) {
		return repository.get(id);
	}

	public Collection<Order> getAll(Class<Order> t) {
		return repository.getAll(t);
	}

	public Collection<Order> getFiltered(Class<Order> t, Criteria criteria) {
		return repository.getFiltered(t, criteria);
	}

	public Order save(Order t) {
		return repository.save(t);
	}

	public Order remove(Order t) {
		return repository.remove(t);
	}

	@Override
	public String toString() {
		return "OrderService [repository=" + repository + "]";
	}

}
