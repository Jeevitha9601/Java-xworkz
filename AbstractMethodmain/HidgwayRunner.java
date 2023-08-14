package AbstractMethodmain;

import AbstractClassAndMethod.Highway;
import AbstractClassAndMethod.NationalHighway;

public class HidgwayRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in highway runner");
		Highway highway = new NationalHighway();
		highway.code();
		highway.distance();
		highway.highwayMan();
		highway.petrol();
		highway.running();
		highway.system();
		highway.tollCollection();
		highway.travel();
	}

}
