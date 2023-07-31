package associationwithmany;

public class Ingredents{
public String name;
public int quantity;
public float cost;
public Ingredents(String name,int quantity,float cost) {
	this.name=name;
	this.quantity=quantity;
	this.cost=cost;
}
public  void  printInfo() {
	System.out.println("Name of Ingredent "+this.name);
    System.out.println("Quantity "+this.quantity);
    System.out.println("Cost "+this.cost);
}
}
