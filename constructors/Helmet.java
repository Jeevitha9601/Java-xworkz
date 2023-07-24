class Helmet{
	static String safety;
	static String headBand;
	String material;
	float price;
	Helmet(String material,float price){
		this.material=material;
		this.price=price;	
		System.out.println("invoking String and String constructor in helmet");
	}
	static{
		safety="For head";
		headBand="Inside helmet";
		System.out.println("invoking static block");
	}
	
		static void printStatic(String safety,String headBand){
			System.out.println("Running printStatic in Helmet");
			System.out.println(safety);
			System.out.println(headBand);
		}
		void printInstance(String material,float price){
			System.out.println("Running printInstance in Helmet");
            System.out.println(this.material);
		    System.out.println(this.price);
		}
	public static void main(String[] args){
	
	  
	  Helmet.printStatic("For head","Inside helmet");
	  System.out.println("Helmet used "+Helmet.safety);
	  System.out.println("band is in "+Helmet.headBand);

	  Helmet helmet=new Helmet("material",566);
	 System.out.println(helmet.material);
	  System.out.println(helmet.price);
	  	  
	

	}
	
}