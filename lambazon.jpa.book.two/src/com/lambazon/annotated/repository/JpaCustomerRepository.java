package com.lambazon.annotated.repository;

import java.util.Collection;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lambazon.annotated.domain.Customer;
import com.lambazon.domain.Criteria;



@Named 
public class JpaCustomerRepository implements Repository<Customer> {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lamazon.jpa");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public Customer get(int id) {
		return entityManager.find(Customer.class, id);
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
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.getTransaction().commit();
		return t;
	}

	public Customer remove(Customer t) {
		entityManager.remove(t);
		return t;
	}

	@Override
	public String toString() {
		return "JpaCustomerRepository []";
	}

}
