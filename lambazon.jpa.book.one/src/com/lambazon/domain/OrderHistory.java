package com.lambazon.domain;



public interface OrderHistory {

	public abstract Status determineStatus(Customer c);

}