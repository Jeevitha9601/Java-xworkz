class Bureau{
	static String store;
	static String lock;
	int length;
	float price;
	Bureau(int length,float price){
	this.length=265;
	this.price=14000f;
	System.out.println("invoking int and float constructor in Bureau ");
	}
	static{
    System.out.println("invoking static block");
	store="Bureau Stroes cloths";
	lock="Lock for safety";
   }
   static void printStatic(String store,String lock){
	    System.out.println("Running printStatic in Bureau");
		System.out.println(store);
		System.out.println(lock);
	}
	void printInstance(int length,float price){
		System.out.println("Running printInstance in Bureau");
		this.length=length;
		this.price=price;
    }
	public static void main(String[] args){

    Candel.printStatic("Bureau Stroes cloths","Lock for safety");
    Candel candel=new Candel(15,14000f);
   

}
}