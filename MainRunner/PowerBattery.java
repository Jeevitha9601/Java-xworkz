package MainRunner;

import main.Battery;
import main.PowerBank;

public class PowerBattery {

	public static void main(String[] args) {
	System.out.println("Invoking main in mainRunner");
	PowerBank powerBank=new PowerBank();
	powerBank.name();
	powerBank.capacity();
	Battery battery=powerBank.battery;//calling battery in powerbank
	battery.brand();
	battery.capacitor();
	
	}

}
