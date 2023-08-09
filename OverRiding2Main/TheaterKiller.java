package OverRiding2Main;

import OverRiding2.NavarangTheater;
import OverRiding2.Theater;

public class TheaterKiller {
	public static void main(String[] args) {
		System.out.println("invoking main in TheaterRunner");
		Theater theater = new NavarangTheater();
		theater.display();
		System.out.println("==========Child ref======");
		NavarangTheater navarangTheater = new NavarangTheater();
		navarangTheater.display();

	}

}
