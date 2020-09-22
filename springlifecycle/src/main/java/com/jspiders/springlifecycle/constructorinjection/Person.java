package com.jspiders.springlifecycle.constructorinjection;

public class Person {
	
	private int id;
	private String name;
	private Address address;
	
	public Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
