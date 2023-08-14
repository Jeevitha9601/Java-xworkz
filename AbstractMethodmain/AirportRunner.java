package AbstractMethodmain;

import AbstractClassAndMethod.Airport;
import AbstractClassAndMethod.Plane;

public class AirportRunner {

	public static void main(String[] args) {
		Airport airport=new Plane();
		airport.baggageHandling();
		airport.control();
		airport.emergenchServices();
		airport.foodServices();
		airport.hangars();
		airport.lounges();
		airport.restaurants();
		airport.security();
		airport.taxiWays();
	}

}
