package OverridingMain;

import OverRiding.Amoeba;
import OverRiding.Fish;

public class AmoebaRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Amoeba Runner");
		Amoeba amoeba=new Fish();
		amoeba.amoebaInfo();
	}

}
