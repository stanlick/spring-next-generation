package com.lambazon.domain;





public abstract class BaseOrderHistory implements OrderHistory {

	public Status determineStatus(Customer customer) {

		double purchases = purchases();

		if (purchases <= 100) {
			return Status.Red;
		} else if (purchases <= 1000) {
			return Status.Green;
		} else if (purchases <= 10000) {
			return Status.Silver;
		} else if (purchases <= 100000) {
			return Status.Gold;
		} else {
			return Status.Titanium;
		}
	}

	public abstract double purchases();
}
