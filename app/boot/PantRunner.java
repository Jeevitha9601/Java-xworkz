package com.xworkz.former.app.boot;

import com.xworkz.former.app.Pant;
import com.xworkz.former.app.Zip;

public class PantRunner {

	public static void main(String[] args) {
		System.out.println("invoking main PantRunner");
		String brand="Levis";
		Zip zip=new Zip();
		Pant pant=new Pant(brand);
		pant.setZip(zip);
		pant.wear();
		
	}

}
