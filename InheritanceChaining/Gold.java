package InheritanceChaining;

public class Gold {
public float price;
public String storeName;
public int gstNumber;
public String location;
public Gold(float price,String storeName,int gstNumber,String location) {
	System.out.println("Invoking with parameter comstructor in Rope ");
	this.price=price;
	this.storeName=storeName;
	this.gstNumber=gstNumber;
	this.location=location;
}
}
