package com.jspiders.springsecond;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDatabase {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("com/jspiders/springsecond/springconfig.xml");
		
		Database database =  (Database) ctx.getBean("database");
		System.out.println(database);
		
		if (ctx != null) {
			ctx.close();
		}
		
	}

}
