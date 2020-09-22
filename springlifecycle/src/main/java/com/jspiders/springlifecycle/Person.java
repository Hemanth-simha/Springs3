package com.jspiders.springlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person{
	
	private int id;
	private String name;
	
	@PostConstruct
	public void hii()
	{
		System.out.println("jdbc code");
	}
	
	@PreDestroy
	public void bye()
	{
		System.out.println("closed all resources");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Id got initalized");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Name got initalized");
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
