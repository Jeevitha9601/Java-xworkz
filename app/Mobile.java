package com.xworkz.former.app;

public class Mobile {
	public double cost;
	public Charger charger;

	public Mobile(double cost) {
		this.cost = cost;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public void communication() {
		System.out.println("invoking communication in Mobile");
		this.charger.fastCharge();
		this.charger.compatiability();
	}

	public void internet() {
		System.out.println("invoking internet in Mobile");
		this.charger.powerSupply();
	}

	public void entertainment() {
		System.out.println("invoking entertainment in Mobile");
		this.charger.safety();
	}

	public void security() {
		System.out.println("invoking security in Mobile");
		this.charger.compatiability();
	}

}
