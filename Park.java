class Park{
String name;
String playGround;
int  benches;
String shadeStructures;
int picnicTabels;
String use;
String walkWays;
String sportsFields;
int childerns;
Park(String name){
	this.name=name;
	System.out.println("invoking with String arguments");
}
Park(String name,String playGround){
	this.name=name;
	this.playGround=playGround;
	System.out.println("invoking with String and String arguments");
}
Park(String name,String playGround,int benches){
	this("name","playGround");
	this.benches=benches;
	System.out.println("invoking with String String and int arguments");
}
Park(String name,String playGround,int benches,String shadeStructures){
	this("name","playGround",benches);
	this.shadeStructures=shadeStructures;
	System.out.println("invoking with String String int and String arguments");
}
Park(String name,String playGround,int benches,String shadeStructures,int picnicTabels){
	this("name","playGround",benches,"shadeStructures");
	this.picnicTabels=picnicTabels;
	System.out.println("invoking with String String 2 int and  String arguments");
}
Park(String name,String playGround,int benches,String shadeStructures,int picnicTabels,String use){
	this("name","playGround",benches,"shadeStructures",picnicTabels);
	this.use=use;
	System.out.println("invoking with String String 2 int and 2 String arguments");
}
Park(String name,String playGround,int benches,String shadeStructures,int picnicTabels,String use,String walkWays){
	this("name","playGround",benches,"shadeStructures",45,"Refresh");
	this.walkWays=walkWays;
	System.out.println("invoking with String String 2 int and 3 String arguments");
}

Park(String name,String playGround,int benches,String shadeStructures,int picnicTabels,String use,String walkWays,String sportsFields){
	this("name","playGround",benches,"shadeStructures",picnicTabels,"use","walkWays");
	this.sportsFields=sportsFields;
	System.out.println("invoking with String String 2 int and 4 String arguments");
}
Park(String name,String playGround,int benches,String shadeStructures,int picnicTabels,String use,String walkWays,String sportsFields,int childerns){
	this("name","playGround",benches,"shadeStructures",picnicTabels,"use","walkWays","sportsField");
	this.childerns=childerns;
	System.out.println("invoking with String String 2 int and 4 String arguments");
}
}