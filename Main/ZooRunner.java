package Main;

import Casting.NationalZoo;
import Casting.StateZoo;
import Casting.Zoo;
import CastingMain.ZooUtil;

public class ZooRunner {

	public static void main(String[] args) {
	
       Zoo zoo=new Zoo();
       
       StateZoo stateZoo=new StateZoo();
       
       NationalZoo nationalZoo=new NationalZoo();
       
       ZooUtil util=new ZooUtil();
       System.out.println("Calling run method with Zoo ref");
       util.run(zoo);
       
       ZooUtil util1=new ZooUtil();  
       System.out.println("Calling run method with national Zoo ref");
       util1.run(nationalZoo);
    
       ZooUtil util2=new ZooUtil();
       System.out.println("Calling run method with  state Zoo ref");
       util2.run(stateZoo);

	}

}
