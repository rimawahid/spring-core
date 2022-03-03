package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testci {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/ci/ci-config.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		Adition add = (Adition) ctx.getBean("adition");
		add.dosum();
		
	}
}
