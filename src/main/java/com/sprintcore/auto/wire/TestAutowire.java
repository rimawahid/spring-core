package com.sprintcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sprintcore/auto/wire/auto-config.xml");
		Emp emp1 = ctx.getBean("emp1", Emp.class);
		System.out.println(emp1);
	}
}
