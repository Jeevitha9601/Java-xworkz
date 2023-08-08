package OverRiding;

public class Dog extends Dinosaur {
@Override
public void fire() {
	System.out.println("over ride in Dog");
	System.out.println("Invoking no argument method in Dog");
}
}
