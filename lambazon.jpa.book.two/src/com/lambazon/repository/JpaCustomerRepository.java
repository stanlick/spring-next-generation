package com.lambazon.repository;

import java.util.Collection;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lambazon.domain.Criteria;
import com.lambazon.domain.Customer;


/*
 * This is a fake JPA repo that was used in the series before annotations 
 * were discussed.  The "real" JPA impl is in com.lambazon.annotated.repository
 */

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
		t.setId(15);
		return t;
	}

	public Customer remove(Customer t) {
		return null;
	}

}
