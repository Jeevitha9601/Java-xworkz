package CastingMain;

import Casting.CaramelChocolate;
import Casting.Chocolate;
import Casting.DarkChocolate;

public class ChocolateUtil {
public void run(Chocolate chocolate) {
	Chocolate choco=new Chocolate();
	choco.sweet();
	
	if(chocolate instanceof DarkChocolate) {
		Chocolate darkChocolate =new DarkChocolate ();
		darkChocolate.sweet();
		DarkChocolate darkChocolate1=(DarkChocolate)darkChocolate;
		darkChocolate1.darkFantacy();
		
		
		if(chocolate instanceof CaramelChocolate) {
			Chocolate caramel=new CaramelChocolate();
			caramel.sweet();
			CaramelChocolate caramelChocolate1=(CaramelChocolate)caramel;
			caramelChocolate1.Chokolate();
		}

	}
}
}
