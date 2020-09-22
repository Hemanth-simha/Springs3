package com.jspiders.springlifecycle.ambiguity;

public class Test {

	public Test(int a,int b) {
		System.out.println("Integer Constructor");
	}
	
	public Test(double a,double b) {
		System.out.println("double Constructor");
	}
	
	public Test(String a,String b) {
		System.out.println("String Constructor");
	}
}
