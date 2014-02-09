package com.lambazon.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lambazon.domain.Customer;
import com.lambazon.domain.CustomerWithConstructorInject;
import com.lambazon.domain.LoadBalancer;
import com.lambazon.domain.Machine;
import com.lambazon.domain.OrderHistoryImplSeasonal;
import com.lambazon.domain.OrderHistoryImplWithReturns;
import com.lambazon.factory.LambazonObjectFactory;

public class Tests {

	@Test
	public void bookTwoTestOne() {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		container.getEnvironment().setActiveProfiles(getMethodName());
		container.refresh();

		Customer customer = container.getBean(Customer.class);

		assertNotNull("Customer should not be null", customer);
		assertNotNull("Customer associated orderHistory should not be null",
				customer.getOrderHistory());
		assertTrue(
				"Customer orderHistory should be OrderHistoryImplWithReturns",
				customer.getOrderHistory() instanceof OrderHistoryImplWithReturns);

	}

	@Test
	public void bookTwoTestTwo() {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		container.getEnvironment().setActiveProfiles(getMethodName());
		container.refresh();

		Customer customer = container.getBean(Customer.class);

		assertNotNull("Customer should not be null", customer);
		assertNotNull("Customer associated orderHistory should not be null",
				customer.getOrderHistory());
		assertTrue("Customer orderHistory should  be OrderHistoryImplSeasonal",
				customer.getOrderHistory() instanceof OrderHistoryImplSeasonal);
	}

	@Test
	public void bookTwoTestThree() {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		container.getEnvironment().setActiveProfiles(getMethodName());
		container.refresh();

		CustomerWithConstructorInject customer = container
				.getBean(CustomerWithConstructorInject.class);

		assertNotNull("Customer should not be null", customer);
		assertNotNull("Customer associated orderHistory should not be null",
				customer.getOrderHistory());
		assertTrue("Customer orderHistory should  be OrderHistoryImplSeasonal",
				customer.getOrderHistory() instanceof OrderHistoryImplSeasonal);
	}

	@Test
	public void bookTwoTestFour() {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		LambazonObjectFactory factory = container
				.getBean(LambazonObjectFactory.class);
		Machine bestMachine = factory.get(Machine.class);
		System.out.println(factory);
		System.out.println(bestMachine);
		assertNotNull("Factory should not be null", factory);
		assertNotNull("get(Machine.class) should not be null", bestMachine);
	}

	@Test
	public void bookTwoTestFive() {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		container.getEnvironment().setActiveProfiles(getMethodName());
		container.refresh();

		LoadBalancer loadBalancer = container.getBean(LoadBalancer.class);

		assertNotNull("LoadBalancer should not be null", loadBalancer);
		assertNotNull("Machine associated LoadBalancer should not be null",
				loadBalancer.getBestMachine());
	}

	@Test
	public void bookTwoTestSix() {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		container.getEnvironment().setActiveProfiles(getMethodName());
		container.refresh();

		Machine machine = container.getBean(Machine.class);
		assertNotNull("Machine should not be null", machine);
	}

	@Test
	public void bookTwoTestSeven() {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		container.getEnvironment().setActiveProfiles(getMethodName());
		container.refresh();

		Controller<Customer> controller = container.getBean(Controller.class);

		Customer customer = new Customer();
		assertNull("Customer id should be null", customer.getId());

		customer = controller.save(customer);
		assertNotNull("Customer id should not be null", customer.getId());

		customer = controller.get(customer.getId());
		assertNotNull("Customer should not be null", customer);

	}

	// actual unit test method name was in slot 2 of the stack
	private String getMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}
}
