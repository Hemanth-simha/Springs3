package com.jspiders.springlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("com/jspiders/springlifecycle/springconfig.xml");
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		
		if (ctx != null) {
			ctx.close();
		}
	}

}
