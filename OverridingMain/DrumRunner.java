package OverridingMain;

import OverRiding.Drum;
import OverRiding.Syntax;

public class DrumRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in DrumRunner ");
		Drum drum=new Syntax();
		drum.drumInfo();
	}

}
