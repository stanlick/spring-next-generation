package com.lambazon.annotated.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lambazon.annotated.domain.Order;
import com.lambazon.annotated.domain.Shipping;
import com.lambazon.configuration.ShippingSpringConfiguration;
import com.lambazon.configuration.SpringConfiguration;
import com.lambazon.configuration.profiles.DriverManagerConnectionSource;
import com.lambazon.configuration.profiles.JndiConnectionSource;
import com.lambazon.configuration.profiles.MockConnectionPool;
import com.lambazon.domain.Customer;
import com.lambazon.domain.Foo;
import com.lambazon.domain.OrderHistory;
import com.lambazon.quiz.configuration.ConfigurationForModeCondition;
import com.lambazon.quiz.configuration.ConfigurationForModeConditionDevelopment;
import com.lambazon.quiz.configuration.ConfigurationForModeConditionProduction;
import com.lambazon.quiz.configuration.CurrentSystemMode;
import com.lambazon.quiz.configuration.MachineMode;
import com.lambazon.quiz.configuration.Quiz;
import com.lambazon.repository.BatchRepository;


/*
 * 
 * Several of these tests use the package scan feature of Spring.
 * WIth so many varied examples, I had to name packages according 
 * to their desired demonstration.  For example 
 * 
 * com.lambazon.quiz.configuration
 * com.lambazon.combined.configuration
 * 
 * is 
 * 
 * 
 * 
 */



public class TestJavaConfig {

	@Test
	public void bookTwoTestEleven() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);
		Customer customer = container.getBean(Customer.class);

		assertNotNull("Customer should not be null", customer);

		OrderHistory orderHistory = customer.getOrderHistory();
		assertNotNull("Customer OrderHistory should not be null", orderHistory);

	}

	@Test
	public void bookTwoTestTwelve() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(
				ShippingSpringConfiguration.class);
		Shipping shipping = container.getBean(Shipping.class);

		assertNotNull("Shipping should not be null", shipping);
		assertNotNull("Shipping carrier should not be null",
				shipping.getCarrier());
	}

	@Test
	public void bookTwoTestThirteen() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);
		Shipping shipping = container.getBean(Shipping.class);

		assertNotNull("Shipping should not be null", shipping);
		assertNotNull("Shipping carrier should not be null",
				shipping.getCarrier());

		Customer customer = container.getBean(Customer.class);

		assertNotNull("Customer should not be null", customer);

		OrderHistory orderHistory = customer.getOrderHistory();
		assertNotNull("Customer OrderHistory should not be null", orderHistory);
	}

	@Test
	public void bookTwoTestFourteen() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.lambazon.configuration");
		container.refresh();

		Shipping shipping = container.getBean(Shipping.class);

		assertNotNull("Shipping should not be null", shipping);
		assertNotNull("Shipping carrier should not be null",
				shipping.getCarrier());

		Customer customer = container.getBean(Customer.class);

		assertNotNull("Customer should not be null", customer);

		OrderHistory orderHistory = customer.getOrderHistory();
		assertNotNull("Customer OrderHistory should not be null", orderHistory);
	}

	@Test
	public void bookTwoTestFifteen() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.lambazon.configuration");
		container.refresh();
		Order order = container.getBean(Order.class);

		assertNotNull("Order should not be null", order);
		assertNotNull("Order shipping should not be null", order.getShipping());
	}
	
	
	@Test
	public void bookTwoTestSixteen() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.lambazon.combined.configuration");
		container.refresh();
		BatchRepository batchRepository = container.getBean(BatchRepository.class);


		assertNotNull("BatchRepository should not be null", batchRepository);
		assertNotNull("BatchRepository connection should not be null", batchRepository.getConnection());
	}
	
	@Test
	public void bookTwoTestSeventeen() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.getEnvironment().setActiveProfiles(getMethodName(),"FooBarBazConfig");
		container.scan("com.lambazon.configuration" );
		container.refresh();
		
		Foo foo1 = container.getBean(Foo.class);
		System.out.println(foo1);

		Foo foo2 = container.getBean(Foo.class);
		System.out.println(foo2);

		assertSame("foo1 should equal foo2", foo1,foo2);

	}	
	
	@Test
	public void bookTwoTestEighteen() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.getEnvironment().setActiveProfiles(getMethodName(),"FooBarBazConfig");
		container.scan("com.lambazon.configuration" );
		container.refresh();
		Foo foo1 = container.getBean(Foo.class);
		System.out.println(foo1);

		Foo foo2 = container.getBean(Foo.class);
		System.out.println(foo2);

		assertNotSame("foo1 should not equal foo2", foo1,foo2);

	}

	@Test
	public void bookTwoTestNineteen() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.getEnvironment().setActiveProfiles(getMethodName(),"FooBarBazConfig");
		container.scan("com.lambazon.configuration" );
		container.refresh();
		
		Foo foo1 = container.getBean(Foo.class);
		System.out.println(foo1);

		Foo foo2 = container.getBean(Foo.class);
		System.out.println(foo2);

		assertNotSame("foo1 should not equal foo2", foo1,foo2);
		assertSame("foo1's bar should equal foo2's bar", foo1.getBar(),foo2.getBar());

	}
	
	@Test
	public void bookTwoTestTwenty() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);
		Order order = container.getBean(Order.class);

		assertNotNull("Order should not be null", order);
		assertNotNull("Order shipping should not be null", order.getShipping());
	}

	@Test
	public void bookTwoTestTwentyOne() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.getEnvironment().setActiveProfiles("development");
		container.scan("com.lambazon.configuration.profiles" );
		container.refresh();		
		
		MockConnectionPool connectionPool = container.getBean(MockConnectionPool.class);
		assertTrue("ConnectionPool should have been injected with DriverManagerConnectionSource",  connectionPool.getConnection() instanceof DriverManagerConnectionSource);
	}
	
	@Test
	public void bookTwoTestTwentyTwo() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.getEnvironment().setActiveProfiles("production");
		container.scan("com.lambazon.configuration.profiles" );
		container.refresh();		
		
		MockConnectionPool connectionPool = container.getBean(MockConnectionPool.class);
		assertTrue("ConnectionPool should have been injected with JndiConnectionSource",  connectionPool.getConnection() instanceof JndiConnectionSource);
	}
	
	@Test
	public void bookTwoTestTwentyThree() {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.getEnvironment().setActiveProfiles("easy");
		container.scan("com.lambazon.quiz.configuration");
		container.refresh();		
		
		Quiz quiz = container.getBean(Quiz.class);
		assertNotNull("Quiz should not be null",  quiz);
		assertNotNull("Quiz questions should not be null",  quiz.getQuestions());
		assertTrue("Quiz question count should be 2 ",  quiz.getQuestions().size()==2);
		assertSame("Quiz difficulty should be easy",  "easy", quiz.getDifficulty());
	}

	@Test()
	public void bookTwoTestTwentyFour() {
		// set to initial default state
		CurrentSystemMode.currentMode=MachineMode.Unknown;
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationForModeCondition.class);		
		
		MachineMode model = container.getBean(MachineMode.class);
		assertTrue("Mode should be Unknown ",  model==MachineMode.Unknown);
	}

	@Test()
	public void bookTwoTestTwentyFive() {
		CurrentSystemMode.currentMode=MachineMode.Production;
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationForModeCondition.class);		
		
		MachineMode model = container.getBean(MachineMode.class);
		assertTrue("Mode should be Production ",  model==MachineMode.Production);
	}
	
	@Test()
	public void bookTwoTestTwentySix() {
		CurrentSystemMode.currentMode=MachineMode.Development;
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationForModeCondition.class);		
		assertTrue("foo should be development foo ",  container.getBean("foo", String.class).equals("development foo"));
		assertTrue("bar should be development bar ",  container.getBean("bar", String.class).equals("development bar"));
		assertTrue("baz should be development baz ",  container.getBean("baz", String.class).equals("development baz"));
	}
	
	@Test()
	public void bookTwoTestTwentySeven() {
		CurrentSystemMode.currentMode=MachineMode.Production;
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationForModeCondition.class);		
		assertTrue("foo should be production foo ",  container.getBean("foo", String.class).equals("production foo"));
		assertTrue("bar should be production bar ",  container.getBean("bar", String.class).equals("production bar"));
		assertTrue("baz should be production baz ",  container.getBean("baz", String.class).equals("production baz"));
	}
	// actual unit test method name was in slot 2 of the stack
	private String getMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}
}
