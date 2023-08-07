package MethodChaining;

public class Specs {
public int power;
public String lens;
public double price;
public boolean refractive() {
	System.out.println("invoking with no argument in Specs ");
	refractive(power,lens,price);
return false;
}
public void refractive(int power) {
	System.out.println("invoking with int argument in Specs ");
	refractive();
}
public void refractive(int power,String lens) {
	refractive(2,"Lens",450);
	System.out.println("invoking with int String argument in Specs ");

}
public void refractive(int power,String lens,double price) {
	System.out.println("invoking with int string and double argument in Specs ");

}
}
