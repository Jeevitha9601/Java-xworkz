package AbstractClassAndMethod;

public abstract class Highway {
	public void travel() {
		System.out.println("Invoking travel method in contract constructor");
	}
	public void running() {
		System.out.println("Invoking running method in contract constructor");
	}
	public void walking() {
		System.out.println("Invoking walking  metehod in contract constructor");
	}

	public void distance() {
		System.out.println("Invoking distance method in contract constructor");
	}
	public void type() {
		System.out.println("Invoking type method in contract constructor");
	}

	public abstract  void code();
	public abstract  void system();
	public abstract void petrol();
	public abstract boolean highwayMan();
	public abstract void tollCollection();

}
