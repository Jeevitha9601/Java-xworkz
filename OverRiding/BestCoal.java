package OverRiding;

public class BestCoal extends Coal {
	
public BestCoal() {
	System.out.println("invoking no argument constructor in Best coal");
}
@Override
public void burn() {
System.out.println("invoking no argument method in Best coal");
	
}

}
