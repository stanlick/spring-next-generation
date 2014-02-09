package com.lambazon.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lambazon.domain.Customer;
import com.lambazon.domain.Machine;
import com.lambazon.domain.Name;
import com.lambazon.factory.LambazonObjectFactory;

public class TestFactory {
	
	@Test 
	public void testFactory() {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		LambazonObjectFactory factory = container.getBean(LambazonObjectFactory.class);
		Machine bestMachine = factory.get(Machine.class);
		System.out.println(factory);
		System.out.println(bestMachine);
		assertNotNull("Factory should not be null", factory);
		assertNotNull("get(Machine.class) should not be null", bestMachine);
		assertNotNull("Factory version should not be null", factory.getVersion());
	}

}
