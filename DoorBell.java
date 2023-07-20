class DoorBell{
String type;
float price;
String color;
String use;
String position;
int howMany;
int  size;
DoorBell(String type){
this.type=type;
}
DoorBell(String type,float price){
this.type=type;
this.price=price;
}
DoorBell(float price,String color){
this.price=price;
this.color=color;
}
DoorBell(float price,String color,String use){
this.price=price;
this.color=color;
this.use=use;
}
DoorBell(String position,String color){
this.price=price;
this.color=color;
this.position=position;
}
DoorBell(String color,int howMany){
this.color=color;
this.howMany=howMany;
}
DoorBell(String color,int howMany,int size){
this.color=color;
this.howMany=howMany;
this.size=size;
}
public static void main(String[] args){
System.out.println("Invoking main method");
DoorBell  doorBell=new DoorBell("wood");
System.out.println("Type of doorbell "+doorBell.type);
DoorBell  doorBell2=new DoorBell("wood",234.5f);
System.out.println("Type of the bell "+doorBell2.type+" price of bell "+doorBell2.price);
DoorBell  doorBell3=new DoorBell("weight",65.77f);
System.out.println("Color of doorbell1 "+doorBell3.color+" price of bell "+doorBell3.price);
DoorBell  doorBell4=new DoorBell(65.77f,"wight","gives signal");
System.out.println("color of doorbell1 "+doorBell4.color+" price of bell "+doorBell4.price+" Use for "+doorBell4.use);
DoorBell  doorBell5=new DoorBell("Red","Outside the door");
System.out.println("color of doorbell1 "+doorBell5.color+" price of bell "+doorBell5.price+" position of bell "+doorBell5.position);
DoorBell  doorBell6=new DoorBell("yellow",2);
System.out.println("color of doorbell1 "+doorBell6.color+" Number of of bell "+doorBell6.howMany);
DoorBell  doorBell7=new DoorBell("yellow",2,45);
System.out.println("color of doorbell1 "+doorBell6.color+" Number of of bell "+doorBell6.howMany+" Size of the bell "+doorBell7.size );


}
}