package MethodChaining;

public class Hotel {
public String location;
public String name;
public int floors;
public void chef() {
	chef("musore","Ashoka",5);
	System.out.println("invoking with no argument in Hotel ");
	
}
public void chef(String location) {
	System.out.println("invoking with String argument in Hotel");
}
public void chef(String location,String name) {
	System.out.println("invoking with String String argument in Hotel");
}
public void chef(String location,String name,int floors) {
	System.out.println("invoking with String String int argument in Hotel location is" +location +" hotel name is  "+name +" number of floors "+floors);
}
}
