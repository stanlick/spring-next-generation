package com.lambazon.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={DomainSpringConfiguration.class, ShippingSpringConfiguration.class, OrderSpringConfiguration.class})
public class SpringConfiguration {
	

}
