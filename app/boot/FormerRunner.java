package com.xworkz.former.app.boot;

import com.xworkz.former.app.Former;
import com.xworkz.former.app.Land;

public class FormerRunner {

	public static void main(String[] args) {
	 System.out.println("Invoking main method in former runner");
     String name="Kumar";
     Land land=new Land();
     Former former=new Former(name);
     former.setLand(land);
     former.forming();
     
	}

}
