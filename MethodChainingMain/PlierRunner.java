package MethodChainingMain;

import MethodChaining.Plier;

public class PlierRunner {

	public static void main(String[] args) {
		Plier plier=new Plier();
		plier.cutter(54);
		plier.cutter("Cut the wire", 56);
	}

}
