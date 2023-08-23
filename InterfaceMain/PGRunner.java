package InterfaceMain;

import com.xworks.appImpelentClass.PG;
import com.xworks.appInterface.PGRules;

public class PGRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PG Runner");
		PGRules pg=new PG();
		pg.payment("5000");
		pg.noFoodWeast(500);
		pg.timings(10);
	}

}
