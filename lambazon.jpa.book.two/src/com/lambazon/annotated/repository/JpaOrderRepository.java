package com.lambazon.annotated.repository;

import java.util.Collection;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lambazon.annotated.domain.Customer;
import com.lambazon.annotated.domain.Order;
import com.lambazon.domain.Criteria;
import com.lambazon.repository.Repository;



@Named
public class JpaOrderRepository implements Repository<Order> {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lamazon.jpa");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public Order get(int id) {
		return entityManager.find(Order.class, id);
	}

	public Collection<Order> getAll(Class<Order> t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Order> getFiltered(Class<Order> t, Criteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	public Order save(Order t) {
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.getTransaction().commit();
		return t;
	}

	public Order remove(Order t) {
		entityManager.remove(t);
		return t;
	}

	@Override
	public String toString() {
		return "JpaOrderRepository []";
	}

}
