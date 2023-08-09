package OverRiding2Main;

import OverRiding2.Drinks;
import OverRiding2.Pub;

public class PubKiiler {

	public static void main(String[] args) {
		System.out.println("invoking main in PubRunner");

		Pub pub = new Pub();
		pub.enjoy();
		System.out.println("********Child ref**********");

		Pub sportsPub = new Drinks();
		sportsPub.enjoy();
	}

}
