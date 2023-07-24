class Butterfly{
static String fly;
static String wings;
int age;
String color;

Butterfly(int age,String color){
	this.age=15f;
	this.color="red";
	System.out.println("invoking int and String constructor in helmet");
    }
static{
    System.out.println("invoking static block");
    fly="Fly";
	wings="2 wings";
    }
static void printStatic(String fly,String wings){
	    System.out.println("Running printStatic in power");
		System.out.println(wattage);
		System.out.println(volt);
	}
void printInstance(int age,String color){
		System.out.println("Running printInstance in power");
		this.age=age;
		this.color=color;
    }
public static void main(String[] args){

    Butterfly.printStatic("fly","2 wings");
    Butterfly butterfly=new Butterfly(15,"black");
   

}
}