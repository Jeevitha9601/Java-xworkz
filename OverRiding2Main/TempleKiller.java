package OverRiding2Main;

import OverRiding2.Ganesha;
import OverRiding2.Temple;

public class TempleKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in TempleRunner");

		Temple temple = new Ganesha();
		temple.hope();
		System.out.println("************Child ref*************");
		Ganesha shivaTemple = new Ganesha();
		shivaTemple.hope();
	}

}
