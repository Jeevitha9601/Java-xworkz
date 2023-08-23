package com.xworks.appImpelentClass;

import com.xworks.appInterface.MilitaryRules;

public class Militory implements MilitaryRules {

	@Override
	public void ageLimit(int minAge) {
System.out.println("Invoking ageLimit Method in militory");
	}

	@Override
	public void height(int minHeight) {
		System.out.println("Invoking height Method in militory");

	}

	@Override
	public void weight(int minWeight) {
		System.out.println("Invoking weight Method in militory");

	}

}
