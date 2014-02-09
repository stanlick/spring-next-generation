package com.lambazon.domain;

import com.lambazon.factory.LambazonObjectFactory;

public class LoadBalancer {
	
	private LambazonObjectFactory objectFactory;

	public void setObjectFactory(LambazonObjectFactory objectFactory) {
		this.objectFactory = objectFactory;
	}
	
	public Machine getBestMachine(){
		return objectFactory.get(Machine.class);
	}

}
