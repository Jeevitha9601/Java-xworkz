package InterfaceMain;

import com.xworks.appImpelentClass.Militory;

public class MilitoryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Militory Runner");
		Militory militory=new Militory();
		militory.ageLimit(21);
		militory.height(6);
		militory.weight(70);
	}

}
