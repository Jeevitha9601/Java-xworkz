package OverridingMain;

import OverRiding.Mic;
import OverRiding.Speaker;

public class MicRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MicRunner ");
		Mic mic=new Speaker();  
		mic.sound();
	}

}
