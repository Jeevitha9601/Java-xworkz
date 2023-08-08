package OverRiding;

public class Moive extends Theater {
@Override
public void theaterInfo() {
	System.out.println("over ride in Moive");
	System.out.println("Invoking no argument method in Moive");
}
}
