package com.lambazon.service;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import com.lambazon.annotated.domain.Customer;
import com.lambazon.annotated.repository.Repository;
import com.lambazon.domain.Criteria;
import com.lambazon.dsl.Loggable;

@Named
public class CustomerService implements Service<Customer> {

	@Inject
	private Repository<Customer> repository;

	public Customer get(int id) {
		return repository.get(id);
	}

	public Collection<Customer> getAll(Class<Customer> t) {
		return repository.getAll(t);
	}

	public Collection<Customer> getFiltered(Class<Customer> t, Criteria criteria) {
		return repository.getFiltered(t, criteria);
	}

	@Loggable
	public Customer save(Customer t) {
		return repository.save(t);
	}

	public Customer remove(Customer t) {
		return repository.remove(t);
	}

	@Override
	public String toString() {
		return "CustomerService [repository=" + repository + "]";
	}

}
