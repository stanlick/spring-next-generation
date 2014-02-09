package com.lambazon.annotated.controller;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lambazon.annotated.domain.Customer;
import com.lambazon.annotated.util.OrderControllerChooser;
import com.lambazon.controller.Controller;





public class TestAnnotated {

	@Test
	public void bookTwoTestEight() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.lambazon.annotated");
		container.refresh();

		Controller<Customer> controller = (Controller<Customer>) container.getBean("customerController");

		Customer customer = new Customer();
		assertNull("Customer id should be null", customer.getId());

		customer = controller.save(customer);
		assertNotNull("Customer id should not be null", customer.getId());

		customer = controller.get(customer.getId());
		assertNotNull("Customer should not be null", customer);
	}
	
	@Test
	public void bookTwoTestNine() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.lambazon.annotated");
		container.refresh();

		LambazonApplication application =  container.getBean(LambazonApplication.class);
		
		assertNotNull("Application customerController should not be null", application.getCustomerController());
		assertNotNull("Application orderController should not be null", application.getOrderController());
		assertNotNull("Application weekendOrderController should not be null", application.getWeekendOrderController());
		
		assertTrue("orderController should have returned OrderController", !(application.getOrderController() instanceof WeekendOrderController));
		assertTrue("weekendOrderController should have returned WeekendOrderController", application.getWeekendOrderController() instanceof WeekendOrderController);
		
		System.out.println(application);
	}	
	
	@Test
	public void bookTwoTestTen() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.lambazon.annotated");
		container.refresh();

		OrderControllerChooser orderControllerChooser =  container.getBean(OrderControllerChooser.class);
		
		assertNotNull("OrderControllerChooser should not be null", orderControllerChooser);
		assertNotNull("OrderControllerChooser should have found Controller<Order>s", orderControllerChooser.getOrderControllers());
		assertNotNull("OrderControllerChooser should have returned Controller<Order>", orderControllerChooser.getController());
		
		int dow = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		if (dow == Calendar.SATURDAY || dow == Calendar.SUNDAY) {
			assertTrue("OrderControllerChooser should have returned WeekendController", orderControllerChooser.getController() instanceof WeekendOrderController);
		} else{
			assertFalse("OrderControllerChooser should have returned WeekendController", orderControllerChooser.getController() instanceof WeekendOrderController);
		}
	}

//	// @Test
//	public void reflectionTest() {
//		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
//		container.getEnvironment().setActiveProfiles(getMethodName());
//
//		Controller<Customer> controller = container
//				.getBean(CustomerController.class);
//
//		Map<String, Object> matches = container.getBeansWithAnnotation(Hot.class);
//
//		Object o = matches.get("customerController");
//		System.out.println("o.getClass().getGenericInterfaces() "
//				+ o.getClass().getGenericInterfaces()[0]);
//		System.out.println("o.getClass().getGenericSuperclass()  "
//				+ o.getClass().getGenericSuperclass());
//
//	}


	// actual unit test method name was in slot 2 of the stack
	private String getMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}
}
