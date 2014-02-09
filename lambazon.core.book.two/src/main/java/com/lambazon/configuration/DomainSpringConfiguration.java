package com.lambazon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lambazon.annotated.domain.Carrier;
import com.lambazon.annotated.domain.RulesEngine;
import com.lambazon.annotated.domain.Shipping;
import com.lambazon.domain.Customer;
import com.lambazon.domain.OrderHistory;
import com.lambazon.domain.OrderHistoryImplWithReturns;

@Configuration
public class DomainSpringConfiguration {
	@Bean
	public Customer customer(){
		Customer customer = new Customer();
		customer.setOrderHistory(orderHistory());
		return customer;
	}

	@Bean
	public OrderHistory orderHistory(){
		return new OrderHistoryImplWithReturns();
	}

}
