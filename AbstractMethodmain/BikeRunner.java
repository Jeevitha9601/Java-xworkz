package AbstractMethodmain;

import AbstractClassAndMethod.Bike;
import AbstractClassAndMethod.Honda;

public class BikeRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in bike runner");
		Bike bike = new Honda();
		bike.cluch();
		bike.engin();
		bike.gear();
		bike.logo();
		bike.mirror();
		bike.run();
		bike.seat();
		bike.shape();
		bike.stop();
	}

}
