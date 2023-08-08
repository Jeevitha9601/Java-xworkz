package OverRiding;

public class Fish extends Amoeba {
	public Fish() {
		System.out.println("invoking no argument constructor in Fish");
	}
@Override
public void amoebaInfo() {
	System.out.println("over ride in Fish");
	System.out.println("Invoking no argument method in Fish");

}
}
