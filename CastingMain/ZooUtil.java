package CastingMain;

import Casting.NationalZoo;
import Casting.StateZoo;
import Casting.Zoo;

public class ZooUtil {
public void run(Zoo zoo) {
	Zoo zoo1=new Zoo();
	zoo1.animals();
	
	if(zoo instanceof StateZoo) {
		Zoo zoo2=new StateZoo();
		zoo2.animals();
		
		StateZoo stateZoo=(StateZoo)zoo2;
		stateZoo.food();
	}
	if(zoo instanceof NationalZoo) {
		Zoo zoo3=new NationalZoo();	
		zoo3.animals();
		
		NationalZoo nationalZoo=(NationalZoo)zoo3;
		nationalZoo.control();
	}
}
}
