package OverRiding2Main;


import OverRiding2.MysureZoo;
import OverRiding2.Zoo;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ZooRunner");

		Zoo zoo = new Zoo();
		zoo.buyTicket();
		System.out.println("**********Child ref");
		Zoo zoo1 = new MysureZoo();
		zoo1.buyTicket();

	}

}
