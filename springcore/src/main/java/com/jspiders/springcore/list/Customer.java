package com.jspiders.springcore.list;

import java.util.List;
import java.util.Set;

public class Customer {
	
	private int id;
	private String name;
	private List<String> products;
	private Set<Long> contacts;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	
	public Set<Long> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Long> contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", products=" + products + ", contacts=" + contacts + "]";
	}
	
}
