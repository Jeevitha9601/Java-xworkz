class Mall{
String name;
String store;
String location;
int distance;
int floors;
String ccTv;
String games;

Mall(String name){
	this.name=name;
	System.out.println("invoking with String arguments");
}
Mall(String name,String store){
	this.name=name;
	this.store=store;
	System.out.println("invoking with String and String arguments");
}
Mall(String name,String store,String location){
	this("name","store");
	this.location=location;
	System.out.println("invoking with 3 String arguments");
}
Mall(String name,String store,String location,int distance){
	this("name","store","location");
	this.distance=distance;
	System.out.println("invoking with 3 String with int arguments");
}
Mall(String name,String store,String location,int distance,int floors){
	this("name","store","location", distance);
	this.floors=floors;
	System.out.println("invoking with 3 String with 2 int arguments");
}
Mall(String name,String store,String location,int distance,int floors,String ccTv){
	this("name","store","location", distance,floors);
	this.ccTv=ccTv;
	System.out.println("invoking with 3 String with 2 int arguments");
}
Mall(String name,String store,String location,int distance,int floors,String ccTv,String games){
	this("name","store","location", distance,floors,"ccTv");
	this.games=games;
	System.out.println("invoking with 5 String with 2 int arguments");
}
}