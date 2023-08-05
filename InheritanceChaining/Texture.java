package InheritanceChaining;

public class Texture extends Ground{
	public Texture() {
     this("Strenth","Brown",500,87);	
	System.out.println("invoking with no argument constructor");
	}
	public Texture(String strucure,String color,int porosity,int density) {
	     super("Strenth","Brown",500,87);	
		System.out.println("invoking with argument constructor in Texture");
		}
}
