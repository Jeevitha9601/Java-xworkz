package com.xworkz.former.app;

public class Shirt {
	private String brand;
	private Button button;
	public Shirt(String brand)
	{
		this.brand=brand;
	}
	public void setButton(Button button) {
		this.button=button;
	}
	public void style()
	{
		System.out.println("invoking style in Shirt");
		this.button.close();
	}

}
