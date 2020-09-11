package com.jspiders.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("com/jspiders/springcore/list/listconfig.xml");
		Customer customer =  (Customer) ctx.getBean("customer");
		
		System.out.println(customer);
		System.out.println(customer.getProducts().getClass());
		System.out.println(customer.getContacts().getClass());
		
		if (ctx != null) {
			ctx.close();
		}
		
	}

}
