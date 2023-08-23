package com.xworks.appImpelentClass;

import com.xworks.appInterface.MetroRules;

public class Metro implements MetroRules {

	@Override
	public String noSmoking(String security) {
System.out.println("Invoking no smoking method in MetroImpliments");
		return "it is a rule bu govt";
	}

	@Override
	public double price(String coins) {
		System.out.println("Invoking price method in MetroImpliments");
		return 10;
	}

	@Override
	public String ticket(String card) {
		System.out.println("Invoking ticket method in MetroImpliments");
		return "mandetory";
	}

}
