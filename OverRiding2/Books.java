package OverRiding2;

public class Books extends Library {
	@Override
	public void displyaInfo() {
		System.out.println("invoking displayInfo method in Books");
		
	}

	@Override
	public void displyaInfo(String name) {
		System.out.println("invoking displayInfo method of String in Books");
		displyaInfo(name);
	}

	@Override
	public void displyaInfo(String name, int capacity) {
		System.out.println("invoking displayInfo method of String,int in Books");
		displyaInfo(name, capacity);
	}

	@Override
	public void displyaInfo(String name, int capacity, String location) {
		System.out.println("invoking displayInfo method of String,int,Strign in Books");
		displyaInfo(name, capacity, location);
	}

	@Override
	public void displyaInfo(String name, int capacity, String location, String librarian) {
		System.out.println("invoking displayInfo method of String,int,Strign,String in Books");
		displyaInfo(name, capacity, location, librarian);
	}

	@Override
	public void displyaInfo(String name, int capacity, String location, String librarian, int openHours) {
		System.out.println("invoking displayInfo method of String,int,Strign,String,int in Books");
	}
}
