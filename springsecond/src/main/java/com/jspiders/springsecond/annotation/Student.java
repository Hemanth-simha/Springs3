package com.jspiders.springsecond.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int regno;
	private String name;
	private Branch branch;

	@Autowired
	public Student(int regno,String name,Branch branch){
		this.regno=regno;
		this.name=name;
		this.branch=branch;
	}
	
	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Branch getBranch() {
		return branch;
	}

	
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", branch=" + branch + "]";
	}
}
