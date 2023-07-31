package associationwithmany;

public class Players {
public Building building;
public String name;
public String exp;
public HomeTown town;
public Players(Building building,String name,String exp,HomeTown town) {
	this.building=building;
	this.name=name;
	this.exp=exp;
	this.town=town;
}
public Players(String string, int i, HomeTown town2, Building building1) {
	// TODO Auto-generated constructor stub
}
public void printInfo() {
	System.out.println("Bulding "+building);
	System.out.println("Name "+name);
	System.out.println("Exp "+exp);
	System.out.println("town "+town);
}
}
