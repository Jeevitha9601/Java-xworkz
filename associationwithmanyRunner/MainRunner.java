package associationwithmanyRunner;

import associationwithmany.Company;
import associationwithmany.Ingredents;
import associationwithmany.Toothpaste;

public class MainRunner {
public static void main(String[] args) {
	System.out.println("Invoking the main in Main Runner");
	String name="CloseUp";
	String brand="CloseUp";
	Company company=new Company("closeUp","Omkar","India");
	Ingredents ingredents1=new Ingredents("Sorbito",45,76f);
	Ingredents ingredents2=new Ingredents("vedha",54,87f);
	Ingredents ingredents3=new Ingredents("Sorbito",87,87f);
	Ingredents ingredents4=new Ingredents("sulfate",23,98f);
	Ingredents ingredents5=new Ingredents("Cellilose",76,98f);
	Ingredents[] ingredents ={ingredents1,ingredents2,ingredents3,ingredents4,ingredents5};
	Toothpaste toothpaste=new Toothpaste(name,brand,company,ingredents);
toothpaste.printInfo();
company.printInfo();
}
}
