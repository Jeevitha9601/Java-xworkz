package OverRiding2;

public class Ganesha extends Temple{
	@Override
	public void hope() {
		System.out.println("invoking hope method in Ganesha");
	}

	@Override
	public void hope(String name) {
		System.out.println("invoking hope method of String in Ganesha");
		hope(name);
	}

	@Override
	public void hope(String name, String location) {
		System.out.println("invoking hope method of String,String in Ganesha");
		hope(name, location);
	}

	@Override
	public void hope(String name, String location, String deity) {
		System.out.println("invoking hope method of String,String,String in Ganesha");
		hope(name, location, deity);
	}

	@Override
	public void hope(String name, String location, String deity, int capacity) {
		System.out.println("invoking hope method of String,String,String,int in Ganesha");
		hope(name, location, deity, capacity);
	}

	@Override
	public void hope(String name, String location, String deity, int capacity, boolean isPowerful) {
		System.out.println("invoking hope method of String,String,String,int,boolean in Ganesha");
	}
}
