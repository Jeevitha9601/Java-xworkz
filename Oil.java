    class Oil{
	String name;
	int viscosity;
	int quantity;
	
	Oil(String name){
	this.name=name;
	}
	Oil(String name,int viscosity){
	this.viscosity=viscosity;
	this.name=name;
	}
	Oil(String name,int viscosity,int quantity){
	this.viscosity=viscosity;
	this.name=name;
	this.quantity=quantity;
	}
	public static void main(String[] args){
	System.out.println("invoking the may method");
	Oil oil=new Oil("gold winner");
	System.out.println("Name of oil "+oil.name);
	Oil oil1=new Oil("palm oil",23);
	System.out.println("Name of oil "+oil1.name+ " viscosity of the oil "+oil1.viscosity);
	Oil oil2=new Oil("coconut oil",54,32);
	System.out.println("Name of oil "+oil2.name+ " viscosity of the oil "+oil2.viscosity+" quantity of the oil "+oil2.quantity);
	}
}