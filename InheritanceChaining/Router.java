package InheritanceChaining;

public class Router {
public int layer;
public String use;
public String transferData;
public String material;
public String ipAddress;

public Router(int layer,String use,String transferData,String material, String ipAddress) {

	System.out.println("Invoking with parameter comstructor in Router ");
	this.layer=layer;
	this.use=use;
	this.transferData=transferData;
	this.material=material;
	this.ipAddress=ipAddress;
		
}

}
