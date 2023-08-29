package com.xworkz.former.app;

public class Trainer {
	private int age;
	private Laptop laptop;
	public Trainer(int age) {
		this.age=age;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop=laptop;
	}
	public void teach() {
		System.out.println("invoking teach in Trainer");
		this.laptop.connect();
	}

}
