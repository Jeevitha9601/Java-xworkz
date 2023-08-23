package InterfaceMain;

import com.xworks.appImpelentClass.Engineering;
import com.xworks.appInterface.EngineeringRules;

public class EngineeringRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in engineering runner");
		EngineeringRules engineering=new Engineering();
		engineering.attendence("EEE");
		engineering.avgMarks(30);
		engineering.regular("StudentID");
		
	}

}
