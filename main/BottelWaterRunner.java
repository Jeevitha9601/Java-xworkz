package main;

import inheritance.Bottel;
import inheritance.Water;

public class BottelWaterRunner {
public static void main(String[] args) {
	Bottel bottel=new Bottel();
	Bottel ref=new Water();
	Water ref1=new Water();
System.out.println(ref1.surfaceTension);	
System.out.println(ref1.material);	
ref1.plastic();
ref1.h2o();
}
}
