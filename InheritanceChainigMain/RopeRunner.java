package InheritanceChainigMain;

import InheritanceChaining.Rope;
import InheritanceChaining.Thred;

public class RopeRunner {
	public static void main(String[] args) {
		
Rope rope=new Rope("Strenth",50,"Flexsiable",500);
System.out.println(rope.flexibility);
System.out.println(rope.strength);
System.out.println(rope.price);
System.out.println(rope.length);
System.out.println("==========================");
Rope thred=new Thred();
System.out.println(thred.flexibility);
System.out.println(thred.strength);
System.out.println(thred.price);
System.out.println(thred.length);

	}
}
