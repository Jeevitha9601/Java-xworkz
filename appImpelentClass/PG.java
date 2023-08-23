package com.xworks.appImpelentClass;

import com.xworks.appInterface.PGRules;

public class PG implements PGRules {

	@Override
	public void timings(int time) {
System.out.println("invoking timing method in PG");
	}

	@Override
	public void payment(String advance) {
		System.out.println("invoking pyment method in PG");
	}

	@Override
	public void noFoodWeast(float paid) {
		System.out.println("invoking noFoodWeast method in PG");
	}

}
