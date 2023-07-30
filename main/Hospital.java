package main;

public class Hospital {
	public Doctor doctor;
public void doctor() {
if(this.doctor!=null) {
	this.doctor.checkUp();
	System.out.println("invoking checkup in Hospital");
}
else {
	System.out.println(" not invoking checkup in Hospital");
}
}

public void operation() {
	if(this.doctor!=null) {
		this.doctor.qualification();
		System.out.println("invoking qualification in Hospital");
	}
	else {
		System.out.println(" not invoking qualification in Hospital");
	}
}
}