package associationwithmany;

public class Corporator {
public String name;
public Building[] buildings;
public Corporator(String name,Building[] buildings) {
	this.name=name;
	this.buildings=buildings;
}
public void printInfo() {
	System.out.println("Name "+name);
	for(int index=0;index<buildings.length;index++) {
		Building ref=buildings[index];
		ref.printInfo();
	}
}
}
