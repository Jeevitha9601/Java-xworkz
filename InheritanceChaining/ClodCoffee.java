package InheritanceChaining;

public class ClodCoffee extends Coffee{
public ClodCoffee() {
	this("Bru",65,"SMT",100);
	System.out.println("invoking with no argument constructor in ColdCoffee");
}
public ClodCoffee(String brand,float price,String storeName,int quantity) {
	super("Bru",65,"SMT",100);
	System.out.println("invoking with no argument constructor in ColdCoffee");
}
}
