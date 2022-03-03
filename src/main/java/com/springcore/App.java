package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Student std = (Student) ctx.getBean("student");
		System.out.println(std);
		Student std2 = (Student) ctx.getBean("student2");
		System.out.println(std2);
	}
}
