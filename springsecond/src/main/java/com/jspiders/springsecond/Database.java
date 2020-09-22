package com.jspiders.springsecond;

public class Database {
	
	private String databaseName;
	private String port;
	private String user;
	private String password;
	
	public Database(String databaseName, String port, String user, String password) {
		this.databaseName = databaseName;
		this.port = port;
		this.user = user;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Database [databaseName=" + databaseName + ", port=" + port + ", user=" + user + ", password=" + password
				+ "]";
	}
	
}
