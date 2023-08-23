package InterfaceMain;

import com.xworks.appImpelentClass.Temple;
import com.xworks.appInterface.TempleRules;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Temple runner");
		Temple temple=new Temple();
		temple.queue("for darshana");
		temple.silence("must be silens");
		temple.dressCode("ethnicwere");
		
	}

}
