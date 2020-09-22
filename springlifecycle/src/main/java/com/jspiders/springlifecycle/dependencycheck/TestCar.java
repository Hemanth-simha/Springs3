package com.jspiders.springlifecycle.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("com/jspiders/springlifecycle/dependencycheck/springconfig.xml");
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		System.out.println(car.hashCode());
		
		Car car1 =  (Car) ctx.getBean("car");
		System.out.println(car1);
		System.out.println(car1.hashCode());
		
		if (ctx != null) {
			ctx.close();
		}
	}

}
