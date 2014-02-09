package com.lambazon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lambazon.annotated.domain.Carrier;
import com.lambazon.annotated.domain.Shipping;

@Configuration
public class ShippingSpringConfiguration {
	
	@Bean
	public Shipping lowestPriceShipping() {

		Carrier carrier=null;
		//flip a coin to demonstrate the logic
		if (Math.random()<0.5) {
			carrier = new Carrier("UPS");			
		} else {
			carrier = new Carrier("FedEx");
		}
		return new Shipping(carrier);
	}


}
