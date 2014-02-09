package com.lambazon.repository;

import java.sql.Connection;

public class BatchRepository {

	private Connection connection;

	public Connection getConnection() {
		return connection;
	}

	public BatchRepository(Connection connection) {
		this.connection = connection;
	}

	@Override
	public String toString() {
		return "BatchRepository [connection=" + connection + "]";
	}
	
	
	

}
