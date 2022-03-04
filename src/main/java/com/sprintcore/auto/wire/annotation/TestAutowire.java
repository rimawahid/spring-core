package com.sprintcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sprintcore/auto/wire/annotation/auto-config.xml");
		Emp emp1 = ctx.getBean("emp1", Emp.class);
		System.out.println(emp1);
	}
}
