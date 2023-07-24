class Candel{
	static String burn;
	static String light;
	int length;
	float price;
	Candel(int length,float price){
	this.length=265;
	this.price=14f;
	System.out.println("invoking int and float constructor in Candel ");
	}
	static{
    System.out.println("invoking static block");
	burn="Burn";
	light="Light";
   }
   static void printStatic(String burn,String light){
	    System.out.println("Running printStatic in candel");
		System.out.println(burn);
		System.out.println(light);
	}
	void printInstance(int length,float price){
		System.out.println("Running printInstance in Bircks");
		this.length=length;
		this.price=price;
    }
	public static void main(String[] args){

    Candel.printStatic("Burn","Light");
    Candel candel=new Candel(15,45f);
   

}
}