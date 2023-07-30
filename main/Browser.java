package main;

public class Browser {
	public Internet internet;
public void search() {
	if(this.internet!=null) {	
	this.internet.connect();
	System.out.println("invoking connect in Browser");
	}
	else {
	System.out.println(" connect is null can not invoke in Browser");

	}
}
	
public void refresh() {
	if(this.internet!=null) {	
	this.internet.offers();
	System.out.println("invoking offers in Browser");
}
	else {
		System.out.println(" offers is null can not invoke in Browser");

	}
}
}