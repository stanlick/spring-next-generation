package com.lambazon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.lambazon.domain.Bar;
import com.lambazon.domain.Baz;
import com.lambazon.domain.Foo;

@Configuration
@Profile("FooBarBazConfig")
public class FooBarBazConfig {
	
	@Bean
	@Profile("bookTwoTestSeventeen")
	public Foo foo1(){
		Foo foo = new Foo();
		foo.setBar(bar());
		return foo;		
	}

	@Bean
	@Scope("prototype")
	@Profile(value={"bookTwoTestEighteen","bookTwoTestNineteen"})
	public Foo foo2(){
		Foo foo = new Foo();
		foo.setBar(bar());
		return foo;		
	}
	
	@Bean
	public Bar bar(){
		return new Bar();
	}
	
	@Bean
	public Baz baz(){
		return new Baz();
	}
}
