package OverRiding;

public class Conductor extends Ticket {
@Override
public void paper() {
	System.out.println("over ride in paper");
	System.out.println("Invoking no argument method in paper");
}
}
