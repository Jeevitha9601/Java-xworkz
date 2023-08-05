package InheritanceChaining;

public class Diamond {
public String hardness;
public float price;
public String shopName;
public String location;

public Diamond(String hardness,float price, String shopName,String location) {
	System.out.println("invoking with argument constructor in Diamond ");
	this.hardness=hardness;
	this.price=price;
	this.shopName=shopName;
	this.location=location;
}
}
