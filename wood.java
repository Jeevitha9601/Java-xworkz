class Wood{
String use;
int size;
int life;
int length;
String roots;

Wood(){
	System.out.println("invoking with no arguments");
}
Wood(String use){
	this.use=use;
	System.out.println("invoking with String arguments");
}
Wood(String use,int size){
	this.use=use;
	this.size=size;
	System.out.println("invoking with String and int arguments");
}
Wood(String use,int size,int life){
	this("use",size);
	this.life=life;
	System.out.println("invoking with String int and int arguments");
}
Wood(String use,int size,int life,int length){
	this("use",size,life);
	this.length=length;
	System.out.println("invoking with String int int ,length arguments");
}
Wood(String use,int size,int life,int length,String roots){
	this("use",size,life,length);
	this.roots=roots;
	System.out.println("invoking with String int int ,length  and roots arguments");
}
}