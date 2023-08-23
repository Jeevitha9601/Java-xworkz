package InterfaceMain;

import com.xworks.appImpelentClass.Metro;
import com.xworks.appInterface.MetroRules;

public class MetroRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in metro runner");
		MetroRules metro = new Metro();
		metro.ticket("By govt");
		metro.price("Coins for travel");
		metro.ticket("Tickets by counter");
	}

}
