package OverRiding2Main;

import OverRiding2.Hospital;
import OverRiding2.Nurse;

public class HospitalKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in Hospital Killer");
		Hospital hospital=new Hospital();
		hospital.injection();
		hospital.injection("Govt Hospital");
		hospital.injection(6);
		Hospital hospital1=new Nurse();
		hospital1.injection();
		hospital1.injection("Rajiv Hospital", "Hassan");
		hospital1.injection(54);
	}

}
