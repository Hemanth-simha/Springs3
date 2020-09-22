package com.jspiders.springlifecycle.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("com/jspiders/springlifecycle/collections/springconfig.xml");
		
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
		System.out.println(student.getSubjects().getClass());
		
		if (ctx != null) {
			ctx.close();
		}
		
	}

}
