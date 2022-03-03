package com.springcore.ci;

public class Adition {
	private int a;
	private int b;

	public Adition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constractor: double, double");
	}

	public Adition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constractor: int, int");
	}

	public Adition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constractor: String, String");
	}

	public void dosum() {
		System.out.println("Value of a:" + this.a);
		System.out.println("Value of b:" + this.b);
		System.out.println("Value of sum: " + (this.a + this.b));
	}
}
