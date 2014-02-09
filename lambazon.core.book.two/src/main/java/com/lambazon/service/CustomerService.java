package com.lambazon.service;

import java.util.Collection;

import com.lambazon.domain.Criteria;
import com.lambazon.domain.Customer;
import com.lambazon.repository.Repository;


public class CustomerService implements Service<Customer> {


	private Repository<Customer> repository;


	public void setRepository(Repository<Customer> repository) {
		this.repository = repository;
	}

	public Customer get(int id) {
		return repository.get(id);
	}

	public Collection<Customer> getAll(Class<Customer> t) {
		return repository.getAll(t);
	}

	public Collection<Customer> getFiltered(Class<Customer> t, Criteria criteria) {
		return repository.getFiltered(t, criteria);
	}

	public Customer save(Customer t) {
		return repository.save(t);
	}

	public Customer remove(Customer t) {
		return repository.remove(t);
	}

}
