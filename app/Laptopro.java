package com.xworkz.former.app;

public class Laptopro {
	private String brand;
	private Processor processor;

	public Laptopro(String brand) {
		this.brand = brand;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void connect() {
		System.out.println("invoking connect in Laptopro");
		this.processor.dataFetching();
	}

	public void communicate() {
		System.out.println("invoking communicate in Laptopro ");
		this.processor.memory();
	}

	public void browse() {
		System.out.println("invoking browse in Laptopro");
		this.processor.storage();
	}

	public void game() {
		System.out.println("invoking game in Laptopro");
		this.processor.security();
	}

}
