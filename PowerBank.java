class PowerBank{
	String color;
	int weight;
	String brand;
	float price;
	int capacity;
	
	PowerBank(){
		
	}
	public static void main(String[] args){
		PowerBank powerbank=new PowerBank();
		System.out.println(powerbank.color);
		System.out.println(powerbank.weight);
		System.out.println(powerbank.brand);
		System.out.println(powerbank.price);
		System.out.println(powerbank.capacity);
		
		powerbank.color="Black";
		powerbank.weight=23;
		powerbank.brand="Polymer";
		powerbank.price=456.7f;
		powerbank.capacity=1000;
		System.out.println(powerbank.color);
		System.out.println(powerbank.weight);
		System.out.println(powerbank.brand);
		System.out.println(powerbank.price);
		System.out.println(powerbank.capacity);
		
		PowerBank powerbank1=new PowerBank();
		ystem.out.println(powerbank1.color);
		System.out.println(powerbank1.weight);
		System.out.println(powerbank1.brand);
		System.out.println(powerbank1.price);
		System.out.println(powerbank1.capacity);
		
		powerbank1.color="Black";
		powerbank1.weight=23;
		powerbank1.brand="Polymer";
		powerbank1.price=456.7f;
		powerbank1.capacity=1000;
		
         System.out.println(powerbank1.color);
		System.out.println(powerbank1.weight);
		System.out.println(powerbank1.brand);
		System.out.println(powerbank1.price);
		System.out.println(powerbank1.capacity);
	}
}