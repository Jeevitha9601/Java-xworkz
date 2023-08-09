package OverRiding2Main;

import OverRiding2.Police;
import OverRiding2.PoliceStation;

public class PoliceStationKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliceStationRunner");

		PoliceStation policeStation = new PoliceStation();
		policeStation.arrest();
		System.out.println("*********Child ref**********");

		PoliceStation policeStation1 = new Police();
		policeStation1.arrest();
	}

}
