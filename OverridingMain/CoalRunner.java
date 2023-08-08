package OverridingMain;

import OverRiding.BestCoal;
import OverRiding.Coal;

public class CoalRunner {

	public static void main(String[] args) {
		Coal coal=new BestCoal();
		coal.burn();
	}

}
