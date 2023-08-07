package MethodChainingMain;

import MethodChaining.Umbrella;

public class UmbrellaRunner {
public static void main(String[] args) {
	Umbrella umbrella=new Umbrella();	
	umbrella.rain("red", 5);
	umbrella.rain();
}
}
