package OverridingMain;

import OverRiding.Banner;
import OverRiding.Flex;

public class FlexRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in FlexRunner ");

		Flex flex=new Banner();
		flex.paper();
	}

}
