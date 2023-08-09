package OverRiding2Main;

import OverRiding2.Hostel;
import OverRiding2.PG;

public class HostelKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in Hostel Killer");
		Hostel hostel=new Hostel();
		hostel.girlsHostel();
		hostel.girlsHostel(500);
		hostel.girlsHostel("SJR");
		Hostel hostel1=new PG();
		hostel1.getClass();
		hostel1.girlsHostel(68);
		hostel1.girlsHostel("Golden");
		hostel1.girlsHostel("TRD", "Bangalore");
	}

}
