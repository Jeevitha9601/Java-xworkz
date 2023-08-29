package com.xworkz.former.app.boot;

import com.xworkz.former.app.Charger;
import com.xworkz.former.app.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MobileRunner");
		double cost=5000;
		Charger charger=new Charger();
		Mobile mobile=new Mobile(cost);	
		mobile.setCharger(charger);
		mobile.communication();
		mobile.entertainment();
		mobile.internet();
		mobile.security();
	}

}
