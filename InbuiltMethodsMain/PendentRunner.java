package InbuiltMethodsMain;

import Methodsclass.Pendent;

public class PendentRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in pendent Runner");
		Pendent pendent = new Pendent();
		System.out.println(pendent);
		Pendent pendent1 = new Pendent("Square","gold","trending","Platinum",5,"festival","with chain","versatile","personalization",567889,10,"Hassan");
		System.out.println(pendent1);
		Pendent pendent2= new Pendent("Round","silver","old","diamond",4,"marriage","with chain","versatile","personalization",34567,20,"Bangalore");
		System.out.println(pendent2);
	}

}
