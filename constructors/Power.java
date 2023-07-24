class Power{
	static int wattage;
	static int volt;
	float price;
	String use;
	
	Power(float price,String use){
    this.price=price;
	this.use=use;
	System.out.println("invoking int and String constructor in Power");
	}
	static{
    System.out.println("invoking static block");
    int wtatage=5;
	int volt=230;
	}
	static void printStatic(int wattage,int volt){
	    System.out.println("Running printStatic in power");
		System.out.println(wattage);
		System.out.println(volt);
	}
	void printInstance(float price,String use){
		System.out.println("Running printInstance in power");
		this.price=657f;
		this.use="light";
	
	}
	public static void main(String[] args){

    Power.printStatic(10,440);
    Power power=new Power(456f,"light");
   

	}
}