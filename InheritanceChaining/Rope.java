package InheritanceChaining;

public class Rope {
public String strength;
public float price;
public String flexibility;
public int length;


public Rope(String strength,float price,String flexibility,int length) {
	System.out.println("Invoking with parameter comstructor in Rope ");
	this.strength=strength;
	this.price=price;
	this.flexibility=flexibility;
	this.length=length;
}
}
