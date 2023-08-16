package InbuiltMethodsMain;

import Methodsclass.Logo;

public class LogoRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in logo runner");
		Logo logo = new Logo();
		System.out.println(logo);
		Logo logo1 = new Logo("Cream",765,987,2456f,"Simple");
		System.out.println(logo1);
		Logo logo2 = new Logo("Brown",54,876,87634f,"Fanncy");
		System.out.println(logo2);
	}

}
