package Main;

import Casting.CaramelChocolate;
import Casting.Chocolate;
import Casting.DarkChocolate;
import CastingMain.ChocolateUtil;

public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate chocolate=new Chocolate();
		DarkChocolate darkChocolate=new DarkChocolate();
		CaramelChocolate caramelChocolate=new CaramelChocolate();
		
		ChocolateUtil util=new ChocolateUtil();
		System.out.println("Calling run method with chocolate  ref");
		util.run(chocolate);
		
		ChocolateUtil util1=new ChocolateUtil();
		System.out.println("Calling run method with  darkChocolate ref");
		util1.run(darkChocolate);
		
		ChocolateUtil util2=new ChocolateUtil();
		System.out.println("Calling run method with caramelChocolate  ref");
		util2.run(caramelChocolate);
		

	}

}
