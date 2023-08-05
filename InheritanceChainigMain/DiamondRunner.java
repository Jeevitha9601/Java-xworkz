package InheritanceChainigMain;

import InheritanceChaining.Cleavage;
import InheritanceChaining.Diamond;

public class DiamondRunner {

	public static void main(String[] args) {
		Diamond diamond=new Diamond("hardness",57990f,"SRS","Mysore");
        System.out.println(diamond.hardness);
        System.out.println(diamond.price);
        System.out.println(diamond.location);
        System.out.println(diamond.shopName);
        Diamond cleavage=new Cleavage();
        System.out.println(cleavage.hardness);
        System.out.println(cleavage.price);
        System.out.println(cleavage.location);
        System.out.println(cleavage.shopName);

	}

}
