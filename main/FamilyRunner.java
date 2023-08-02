package main;

import inheritance.Level5.Father;
import inheritance.Level5.GrandFather;
import inheritance.Level5.GrandSon;
import inheritance.Level5.Mother;
import inheritance.Level5.Son;

public class FamilyRunner {
public static void main(String[] args) {
	GrandFather grandFather=new GrandFather();
	GrandFather ref= new Father();
	Father ref1=new Mother();
	Mother ref2=new Son();
	Son ref3=new GrandSon();
	GrandSon grandSon=new GrandSon();
	System.out.println(ref.name);
	ref.grandFatherInfo();
	System.out.println(ref1.name);
	ref1.fatherInfo();
	System.out.println(ref2.name);
	ref2.motherInfo();
	System.out.println(ref3.name);
	ref3.sonInfo();
	System.out.println(grandSon.name);
	grandSon.grandSonInfo();
}
}
