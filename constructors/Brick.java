class Brick{
	static String shape;
	static String color;
	float size;
	float density;
	Brick(float size,float density){
	this.size=2.65f;
	this.density=14f;
	System.out.println("invoking int and String constructor in bricks");
	}
	static{
    System.out.println("invoking static block");
	shape="Square";
	color="Brown";
}
static void printStatic(String shape,String color){
	    System.out.println("Running printStatic in bricks");
		System.out.println(shape);
		System.out.println(color);
	}
	void printInstance(float density,float size){
		System.out.println("Running printInstance in Bircks");
		this.density=density;
		this.size=size;
    }
	public static void main(String[] args){

    Brick.printStatic("Square","Brown");
    Brick brick=new Brick(15f,45f);
   

}
}
