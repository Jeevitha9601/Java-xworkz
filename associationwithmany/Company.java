package associationwithmany;

public class Company {
public String name;
public String ceo;
public String originCountry;
public Company(String name,String ceo,String originCountry) {
	this.name=name;
	this.ceo=ceo;
	this.originCountry=originCountry;
}
public void printInfo() {
	System.out.println("Name "+name);
	System.out.println("Name of ceo "+ceo);
	System.out.println("Origin Country "+originCountry);
}
}
