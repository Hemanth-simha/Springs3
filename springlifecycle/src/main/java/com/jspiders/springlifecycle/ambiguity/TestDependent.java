package com.jspiders.springlifecycle.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("com/jspiders/springlifecycle/ambiguity/springconfig.xml");
		
		Test test =  (Test) ctx.getBean("test");
		
		if (ctx != null) {
			ctx.close();
		}
		
	}

}
