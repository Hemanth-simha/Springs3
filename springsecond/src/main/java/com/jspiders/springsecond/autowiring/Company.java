package com.jspiders.springsecond.autowiring;

public class Company {
	
	private int numberOfEmployee;
	private String name;
	private String location;
	
	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}
	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Company [numberOfEmployee=" + numberOfEmployee + ", name=" + name + ", location=" + location + "]";
	}
	
}
