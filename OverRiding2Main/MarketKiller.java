package OverRiding2Main;

import OverRiding2.FishMarket;
import OverRiding2.Market;

public class MarketKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in MarketRunner");

		Market market = new Market();
		
		System.out.println("*********Child ref*************");
		Market fishMarket = new FishMarket();
		fishMarket.sell();
	}

}
