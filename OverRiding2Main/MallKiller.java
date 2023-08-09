package OverRiding2Main;

import OverRiding2.Mall;
import OverRiding2.Shop;

public class MallKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in Hostel Killer");
		Mall mall = new Mall();
		mall.mallInfo();
		mall.mallInfo(1000);
		mall.mallInfo("LULU");
		Mall mall1=new Shop();
		mall1.mallInfo();
		mall.mallInfo(1200);
		mall.mallInfo("Super");
	}

}
