package com.xworkz.former.app.boot;

import com.xworkz.former.app.Laptopro;
import com.xworkz.former.app.Processor;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LaptopRunner");
		String brand="Dell";
		Processor processor=new Processor();
		Laptopro laptopro=new Laptopro(brand);
		laptopro.setProcessor(processor);
		laptopro.browse();
		laptopro.communicate();
		laptopro.connect();
		laptopro.game();
	}

}
