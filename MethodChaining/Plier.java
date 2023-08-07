package MethodChaining;

public class Plier {
public String use;
public double price;
public int weight;
public void cutter() {
	System.out.println("invoking with no argument in plier");
}
public void cutter(String use,double price,int weight) {
	System.out.println("invoking with String double and weight argument in plier");
}
public void cutter(String use,int weight) {
	cutter();
	System.out.println("invoking with String  and weight argument in plier");
}
public void cutter(int weight) {
	System.out.println("invoking with  weight argument in plier");
}
}
