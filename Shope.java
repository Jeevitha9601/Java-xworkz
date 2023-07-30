package main;

public class Shope {
	public SalesMan salesMan;
public void name() {
	if(this.salesMan!=null) {
		this.salesMan.age();
		System.out.println("invoking chef in Hotel ");
	}
	else {
		System.out.println(" age is null can not invoke in Hotel");
		}
}
public void location() {
	if(this.salesMan!=null) {
		this.salesMan.product();
		System.out.println("invoking product in Hotel ");
	}
	else {
		System.out.println(" product is null can not invoke in Hotel");

	}
}
}
