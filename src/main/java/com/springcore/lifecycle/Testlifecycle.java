package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testlifecycle {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle-config.xml");
		//registering shutdown hook
		ctx.registerShutdownHook();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		System.out.println("++++++++++++++++++++++");
		
		Fruit fruit = (Fruit) ctx.getBean("fruit");
		System.out.println(fruit);
		
	}
}
