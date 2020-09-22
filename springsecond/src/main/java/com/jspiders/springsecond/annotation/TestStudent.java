package com.jspiders.springsecond.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("com/jspiders/springsecond/annotation/springconfig.xml");
		
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
		
		if (ctx != null) {
			ctx.close();
		}
	}

}
