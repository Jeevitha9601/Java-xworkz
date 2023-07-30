package main;

public class Hotel {
public Cook cook;
public void staff() {
	if(this.cook!=null) {
		this.cook.chef();
		System.out.println("invoking chef in Hotel ");
	}
	else {
	System.out.println(" chef is null can not invoke in Hotel");

	}
}
public void owner() {
	if(this.cook!=null) {
		this.cook.kitchen();
		System.out.println("invoking kitchen in Hotel ");
	}
	else {
	System.out.println(" kitchen is null can not invoke in Hotel");

	}
}
}
