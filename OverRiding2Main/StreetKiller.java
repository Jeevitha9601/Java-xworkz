package OverRiding2Main;

import OverRiding2.Street;
import OverRiding2.StreetFood;

public class StreetKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in StreetRunner");

		Street street = new Street();
		street.addLandMark();
		System.out.println("***********Child ref************");
		Street street1 = new StreetFood();
		street1.addLandMark();
	}
	}
