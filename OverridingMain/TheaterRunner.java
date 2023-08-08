package OverridingMain;

import OverRiding.Moive;
import OverRiding.Theater;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in TheaterRunner ");
		Theater theater=new Moive();
		theater.theaterInfo();
	}

}
