package com.xworks.appImpelentClass;

import com.xworks.appInterface.EngineeringRules;

public class Engineering implements EngineeringRules {

	@Override
	public void attendence(String branch) {
System.out.println("Invoking attendence method in Engineering");
	}

	@Override
	public void avgMarks(int avgInternalMarks) {
		System.out.println("Invoking avgMarks method in Engineering");

	}

	@Override
	public boolean regular(String id) {
		System.out.println("Invoking regular method in Engineering");
		return false;
	}

}
