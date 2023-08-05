package InheritanceChaining;

public class Cleavage extends Diamond {
public Cleavage() {
	this("hardness",9887665f,"Joyalukkas","Bangalore");
	System.out.println("invoking with no argument in Cleavage");
}
public Cleavage(String hardness,float price, String shopName,String location) {
	super("hardness",9887665f,"Joyalukkas","Bangalore");
	System.out.println("invoking with argument in Cleavage");
}
}