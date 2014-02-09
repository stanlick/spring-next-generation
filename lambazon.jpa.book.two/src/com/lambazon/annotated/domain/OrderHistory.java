package com.lambazon.annotated.domain;

import com.lambazon.domain.Status;



public interface OrderHistory {

	public abstract Status determineStatus(Customer c);

}