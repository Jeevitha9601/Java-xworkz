package InheritanceChaining;

public class Thred extends Rope {

	public Thred() {
	this("Strenth",50,"Flexsiable",500);	
	System.out.println("invoking with no argument constructor");
	}
	public Thred(String strength,float price,String flexibility,int length) {
		super("Strenth",50,"Flexsiable",500);
		System.out.println("Invoking with parameter comstructor in Thred ");
	}
}
