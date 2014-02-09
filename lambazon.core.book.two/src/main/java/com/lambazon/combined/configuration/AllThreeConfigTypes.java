package com.lambazon.combined.configuration;

/*
 * this package was created for the combined boot with xml, annotations and JavaConfig
 * other tests were failing when they encountered this scenario so I just pulled these
 * into their own little package.
 */


import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

import com.lambazon.repository.BatchRepository;

@Configuration
@ImportResource("classpath:data.xml")
public class AllThreeConfigTypes {
	
	
	@Inject
	ConnectionPool connectionPool;
	
	@Bean
	public BatchRepository batchRepository(){
		return new BatchRepository(connectionPool.getConnection());
	}

}
