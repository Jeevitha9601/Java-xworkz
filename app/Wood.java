package com.xworkz.former.app;

public class Wood {
	private String name;
	private Paper paper;
	public Wood(String name) {
		this.name=name;
	}
	public void setPaper(Paper paper) {
		this.paper=paper;
	}
	public void construct() {
		System.out.println("invoking construct in Wood");
		this.paper.write();
	}

}
