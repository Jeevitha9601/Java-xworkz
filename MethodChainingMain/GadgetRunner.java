package MethodChainingMain;

import MethodChaining.Gadget;

public class GadgetRunner {
public static void main(String[] args) {
	Gadget gadget=new Gadget();
	gadget.houseHold();
	gadget.houseHold("accesability");
	gadget.houseHold("Sensing","In anyware ",34f);
}
}
