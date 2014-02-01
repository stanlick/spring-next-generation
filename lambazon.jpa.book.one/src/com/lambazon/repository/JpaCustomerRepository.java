package com.lambazon.repository;

import java.util.Collection;

import javax.inject.Named;

import com.lambazon.domain.Criteria;
import com.lambazon.domain.Customer;

@Named
public class JpaCustomerRepository implements Repository<Customer> {

	public Customer get(int id) {
		Customer customer = new Customer();
		customer.setId(id);
		return customer;
	}

	public Collection<Customer> getAll(Class<Customer> t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Customer> getFiltered(Class<Customer> t, Criteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer save(Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer remove(Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

}
