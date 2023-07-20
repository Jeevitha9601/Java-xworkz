class Badminton{
	String cock;
	String bat;
	int noOfBat;
	String thred;
	float price;
	
	Badminton(){
		
	}
	public static void main(String[] args){
		Badminton badminton=new Badminton();
		
		System.out.println(badminton.cock);
		System.out.println(badminton.bat);
		System.out.println(badminton.noOfBat);
		System.out.println(badminton.thred);
		System.out.println(badminton.price);
		
		badminton.bat="Badminton";
       badminton.cock="Cock-Rock";	
       badminton.noOfBat=4;
       badminton.thred="Guts";	
       badminton.price=250f;
	   
	   System.out.println(badminton.cock);
		System.out.println(badminton.bat);
		System.out.println(badminton.noOfBat);
		System.out.println(badminton.thred);
		System.out.println(badminton.price);
		
		Badminton badminton1=new Badminton();	
		System.out.println(badminton1.cock);
		System.out.println(badminton1.bat);
		System.out.println(badminton1.noOfBat);
		System.out.println(badminton1.thred);
		System.out.println(badminton1.price);
		
       badminton1.bat="Bat";
       badminton1.cock="Cock";	
       badminton1.noOfBat=2;
       badminton1.thred="Guts";	
       badminton1.price=150f;
	   	System.out.println(badminton1.bat);
		System.out.println(badminton1.cock);
		System.out.println(badminton1.noOfBat);
		System.out.println(badminton1.thred);
		System.out.println(badminton1.price);

		
	}
}