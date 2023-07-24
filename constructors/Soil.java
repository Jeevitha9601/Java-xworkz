class Soil{
static String soilTexture;
static String soilAbsorption;
float density;
float soilPH;
Soil(float density,float soilPH){
	this.density=2.65f;
	this.soilPH=14f;
	System.out.println("invoking int and String constructor in Soil ");
}
static{
    System.out.println("invoking static block");
	soilTexture="Water holing capacity";
	soilAbsorption="water absorption";
}
static void printStatic(String soilTexture,String soilAbsorption){
	    System.out.println("Running printStatic in soil");
		System.out.println(soilTexture);
		System.out.println(soilAbsorption);
	}
	void printInstance(float density,float soilPH){
		System.out.println("Running printInstance in soil");
		this.density=density;
		this.soilPH=soilPH;
    }
	public static void main(String[] args){

    Soil.printStatic("Water holing capacity","water absorption");
    Soil soil=new Soil(15f,45f);
   

}
}