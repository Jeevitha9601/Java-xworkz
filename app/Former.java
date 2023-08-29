package com.xworkz.former.app;

public class Former {
	private String name;
	private Land land;

	public Former(String name) {
		this.name = name;
	}

	public void setLand(Land land) {
		this.land = land;
	}

	public void forming() {
		System.out.println("invoking formering method in Former");
        this.land.cropGrowth();
	}
}
