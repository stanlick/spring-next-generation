package com.lambazon.annotated.util;

import java.util.Calendar;
import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import com.lambazon.annotated.domain.Order;
import com.lambazon.controller.Controller;
import com.lambazon.domain.dsl.Weekday;
import com.lambazon.domain.dsl.Weekend;

@Named
public class OrderControllerChooser {

	
	@Inject
	private Collection<Controller<Order>> orderControllers;

	public Collection<Controller<Order>> getOrderControllers() {
		return orderControllers;
	}
	
	public Controller<Order> getController(){
		int dow = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		if (dow == Calendar.SATURDAY || dow == Calendar.SUNDAY) {
			return getWeekendController();
		} else{
			return getWeekdayController();
		}
	}

	private Controller<Order> getWeekendController() {
		for (Controller<Order> controller : orderControllers) {
			if (controller.getClass().isAnnotationPresent(Weekend.class)) {
				return controller;
			}
		}
		return null;
	}
	
	private Controller<Order> getWeekdayController() {
		for (Controller<Order> controller : orderControllers) {
			if (controller.getClass().isAnnotationPresent(Weekday.class)) {
				return controller;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "OrderControllerChooser [orderControllers=" + orderControllers
				+ "]";
	}
	
	
}
