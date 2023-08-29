package com.xworkz.former.app;

public class Passenger {
	private double ticket;
	private Bus bus;
	public Passenger(double ticket) {
		this.ticket=ticket;
		
	}
	public void setBus(Bus bus) {
		this.bus=bus;
	}
	public void tarvel()
	{
		System.out.println("invoking travel in Passenger");
		this.bus.carry();
	}

}
