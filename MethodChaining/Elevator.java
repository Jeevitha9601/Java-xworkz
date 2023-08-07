package MethodChaining;

public class Elevator {
public String shift;
public int speed;
public String regidity;
public void elevatorInfo() {
	System.out.println("invoking with no argument in Elevator");
}
public void elevatorInfo(String shift,int speed,String regidity) {
	System.out.println("invoking with String int and String argument in Elevator");
}
public void elevatorInfo(String shift,int speed) {
	elevatorInfo();
	System.out.println("invoking with String int  argument in Elevator");
}
public void elevatorInfo(String shift) {
	elevatorInfo("uo-down",43,"Regidity")
	System.out.println("invoking with String argument in Elevator");
}
}
