package InheritanceChaining;

public class BroadCast extends Router{
public BroadCast() {
	this(3,"LAN","To differnt networ","HP","CMD");
	System.out.println("invoking with no argument constructor");
	
}

public BroadCast(int layer,String use,String transferData,String material, String ipAddress) {
	super(3,"LAN","To differnt network","HP","CMD");
	System.out.println("Invoking with parameter comstructor in BroadCast ");

}
}
