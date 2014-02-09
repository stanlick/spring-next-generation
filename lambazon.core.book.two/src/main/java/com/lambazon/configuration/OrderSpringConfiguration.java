package com.lambazon.configuration;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lambazon.annotated.domain.Order;

@Configuration
public class OrderSpringConfiguration {
	
	@Inject
	ShippingSpringConfiguration shippingSpringConfiguration;
	
	@Bean
	public Order order(){
		Order order = new Order();
		order.setShipping(shippingSpringConfiguration.lowestPriceShipping());
		return order;
	}

}
