package InheritanceChaining;

public class Platinum extends Gold{
public Platinum() {
	this(40000f,"SRS",4567,"Hassan");
	System.out.println("Invoking with no parameter comstructor in  Platinum");

}
public Platinum(float price,String storeName,int gstNumber,String location) {
	super(40000f,"SRS",4567,"Hassan");
	System.out.println("Invoking with parameter comstructor in  Platinum");
	
}

}
