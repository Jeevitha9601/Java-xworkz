package com.xworkz.former.app.boot;

import com.xworkz.former.app.Button;
import com.xworkz.former.app.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ShirtRunner");
		String brand="PeterEngland";
		Button button=new Button();
		Shirt shirt=new Shirt(brand);
		shirt.setButton(button);
		shirt.style();
		
		
		
	}

}
