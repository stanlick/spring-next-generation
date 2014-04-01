package com.lambazon.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;






import com.lambazon.annotated.domain.Customer;
import com.lambazon.annotated.domain.Name;
import com.test.president.Citizen;

public class TestCustomer {

	@Test
	public void bookThreeTestOne() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.lambazon");
		container.refresh();

		Controller<Customer> controller = (Controller<Customer>) container.getBean("customerController");

		Customer customer = new Customer();
		customer.setName(new Name("James", "Scott", "Stanlick"));
		assertNull("Customer id should be null", customer.getId());

		customer = controller.save(customer);
		assertNotNull("Customer id should not be null", customer.getId());

		customer = controller.get(customer.getId());
		assertNotNull("Customer should not be null", customer);
	}

	@Test
	public void bookThreeTestTwo() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.test.president");
		container.refresh();

		Citizen citizen = container.getBean(Citizen.class);
		assertNotNull("Citizen should not be null", citizen != null);
	
		citizen.askQuestion();
	
	}

	// // @Test
	// public void reflectionTest() {
	// AnnotationConfigApplicationContext container = new
	// AnnotationConfigApplicationContext();
	// container.getEnvironment().setActiveProfiles(getMethodName());
	//
	// Controller<Customer> controller = container
	// .getBean(CustomerController.class);
	//
	// Map<String, Object> matches =
	// container.getBeansWithAnnotation(Hot.class);
	//
	// Object o = matches.get("customerController");
	// System.out.println("o.getClass().getGenericInterfaces() "
	// + o.getClass().getGenericInterfaces()[0]);
	// System.out.println("o.getClass().getGenericSuperclass()  "
	// + o.getClass().getGenericSuperclass());
	//
	// }

	// actual unit test method name was in slot 2 of the stack
	private String getMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}
}
