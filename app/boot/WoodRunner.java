package com.xworkz.former.app.boot;

import com.xworkz.former.app.Paper;
import com.xworkz.former.app.Wood;

public class WoodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in WoodRunner");
		String name="Bamboo";
		Paper paper=new Paper();
		Wood wood=new Wood(name);
		wood.setPaper(paper);
		wood.construct();
	}

}
