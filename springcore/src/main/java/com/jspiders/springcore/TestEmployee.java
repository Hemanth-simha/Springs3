package com.jspiders.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("com/jspiders/springcore/springconfig.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
		
		if (ctx != null) {
			ctx.close();
		}
	}

}
