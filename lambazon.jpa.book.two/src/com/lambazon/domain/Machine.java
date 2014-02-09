package com.lambazon.domain;

public class Machine {

	private String ip;

	public Machine(String ip) {
		setIp(ip);
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Machine [ip=" + ip + "]";
	}
	
	
	
}
