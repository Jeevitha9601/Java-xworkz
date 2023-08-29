package com.xworkz.former.app.boot;

import com.xworkz.former.app.Bus;
import com.xworkz.former.app.Passenger;

public class BusRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in BusRunner");
		double ticket=200;
		Bus bus=new Bus();
		Passenger passenger=new Passenger(ticket);
		passenger.setBus(bus);
		passenger.tarvel();
	}

}
