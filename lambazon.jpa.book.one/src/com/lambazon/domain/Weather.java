package com.lambazon.domain;

public class Weather {
	
	// properties
	private double temperatureAsCelsius;
	private Internet www = new Internet();
	private String url = "weather.com?zipCode=";
	
	//behaviors
	public String whatIsTheTemperature(String zipCode){
		temperatureAsCelsius = www.webService(url+zipCode);
		
		return "The temperature for " +
				zipCode + 
				" is " + 
				asFahrenheit() + 
				" F and " + 
				asCelsius() + 
				" C";
 	}
	
	private double asCelsius(){
		return temperatureAsCelsius;
	}
	
	private double asFahrenheit(){
		return (temperatureAsCelsius*9)/5 + 32;
	}
	
}
