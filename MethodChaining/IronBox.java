package MethodChaining;

public class IronBox {
public float price;
public String brand;
public int temperature;
public void heat() {
	System.out.println("invoking with no argument in IronBox");
	heat(500f,"Femina",30);
}
public void heat(float price) {
	System.out.println("invoking float argument in IronBox");
}
public void heat(float price,String brand) {
	System.out.println("invoking float,String argument in IronBox");
	heat(this.price);//this key word is not mandatory 
}
public void heat(float price,String brand,int temperature) {
	System.out.println("invoking float,String,int argument in IronBox");
}
}
