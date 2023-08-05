package InheritanceChainigMain;

import InheritanceChaining.Gold;
import InheritanceChaining.Platinum;

public class GoldRunner {

	public static void main(String[] args) {
		Gold gold=new Gold(150000f,"Bhima",9876,"Bangalore");
		System.out.println(gold.price);
		System.out.println(gold.storeName);
		System.out.println(gold.gstNumber);
		System.out.println(gold.location);
		System.out.println("==========================");
		Gold platinum=new Platinum();
		System.out.println(platinum.price);
		System.out.println(platinum.storeName);
		System.out.println(platinum.gstNumber);
		System.out.println(platinum.location);
		
	}

}
