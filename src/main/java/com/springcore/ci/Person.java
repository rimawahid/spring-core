package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certi certi;
	private List<String> phones;
	
	public Person(String name, int id, Certi certi, List<String> phones) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
		this.phones= phones;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", certi=" + certi + ", phones=" + phones + "]";
	}

	

	
	
	
}
