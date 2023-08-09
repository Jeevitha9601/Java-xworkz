package OverRiding2;

public class MysureZoo extends Zoo {
	@Override
	public void buyTicket() {
		System.out.println("invoking buyTicket method in MysureZoo");
	}

	@Override
	public void buyTicket(String name) {
		System.out.println("invoking buyTicket method of String in MysureZoo");
		buyTicket(name);
	}

	@Override
	public void buyTicket(String name, String location) {
		System.out.println("invoking buyTicket method of String,String in MysureZoo");
		buyTicket(name, location);
	}

	@Override
	public void buyTicket(String name, String location, int capacity) {
		System.out.println("invoking buyTicket method of String,String,int in MysureZoo");
		buyTicket(name, location, capacity);
	}

	@Override
	public void buyTicket(String name, String location, int capacity, double ticketPrice) {
		System.out.println("invoking buyTicket method of String,String,int,double in MysureZoo");
		buyTicket(name, location, capacity, ticketPrice);
	}

	@Override
	public void buyTicket(String name, String location, int capacity, double ticketPrice, boolean hasAquarium) {
		System.out.println("invoking buyTicket method of String,String,int,double,boolean in MysureZoo");
	}
}
