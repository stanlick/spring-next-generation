package com.lambazon.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lambazon.domain.Weather;

public class TestWeather {

	@Test
	public void test() {
		Weather weather = new Weather();
		System.out.println(weather.whatIsTheTemperature("62025"));
	}

}
