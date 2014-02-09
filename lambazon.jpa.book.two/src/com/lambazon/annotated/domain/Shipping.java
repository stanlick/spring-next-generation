package com.lambazon.annotated.domain;

import javax.persistence.Entity;

@Entity
public class Shipping extends BaseEntity{

	private Carrier carrier;

	public Carrier getCarrier() {
		return carrier;
	}

	public Shipping(){}
	
	public Shipping(Carrier carrier) {
		this.carrier = carrier;
	}

	@Override
	public String toString() {
		return "Shipping [carrier=" + carrier + "]";
	}
}
