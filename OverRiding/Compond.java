package OverRiding;

public class Compond extends Gate {
public Compond() {
	System.out.println("Invoking no argument constructor in Compond");
}
@Override
	public void iron() {
	System.out.println("over ride in Compond");
	System.out.println("Invoking no argument method in Compond");
	}
}
