package com.xworkz.former.app;

public class Pant {
	private String brand;
	private Zip zip;

	public Pant(String brand) {
		this.brand = brand;
	}

	public void setZip(Zip zip) {
		this.zip = zip;
	}

	public void wear() {
		System.out.println("invoking wear in Pant");
		this.zip.close();
	}

}
