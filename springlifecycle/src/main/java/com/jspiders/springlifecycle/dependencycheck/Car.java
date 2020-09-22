package com.jspiders.springlifecycle.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	
	private int number;
	private String name;
	
	public int getNumber() {
		return number;
	}
	
	@Required
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [number=" + number + ", name=" + name + "]";
	}
}
