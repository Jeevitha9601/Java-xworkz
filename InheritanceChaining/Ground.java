package InheritanceChaining;

public class Ground {
public String strucure;
public String color;
public int porosity;
public int density;

public Ground(String strucure,String color,int porosity,int density) {
	System.out.println("Invoking with parameter comstructor in Ground ");
	this.color=color;
	this.strucure=strucure;
	this.porosity=porosity;
	this.density=density;
}
}
