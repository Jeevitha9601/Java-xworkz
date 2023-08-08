package OverridingMain;

import OverRiding.Dinosaur;
import OverRiding.Dog;

public class DinosaurRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in DinosaurRunner ");
		Dinosaur dinosaur=new Dog();
		dinosaur.fire();
	}

}
