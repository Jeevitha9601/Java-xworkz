package MethodChaining;

public class Gadget {
public String sensing;
public String accesability;
public float price;
public void houseHold() {
	System.out.println("invoking with no argument in Gadget");
	houseHold("Sensing","In anyware ",34f);
}
public void houseHold(String sensing,String accesability,float price) {
	houseHold(sensing,accesability);
	System.out.println("invoking with String String and float argument in Gadget");
}
public void houseHold(String sensing,String accesability) {
	System.out.println("invoking with String String argument in Gadget");
	
}
public void houseHold(String sensing) {
	System.out.println("invoking with String argument in Gadget");
}
}
