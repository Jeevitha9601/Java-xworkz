package MethodChaining;

public class Stapler {
public String brand;
public int numberOfPins;
public float price;
public void fiber() {
	this.fiber("Sk", 3000,459f);
	System.out.println("invoking with no argument in Stapler");
}
public void fiber( String brand,int numberOfPins,float price) {
	System.out.println("invoking with String int and float argument in Stapler");
	this.fiber(brand);
}
public void fiber( String brand) {
	System.out.println("invoking with String  argument in Stapler");
	this.fiber();//this is not mandatory
}
public void fiber( String brand,float price) {
	System.out.println("invoking with String  and float argument in Stapler");
}
}
