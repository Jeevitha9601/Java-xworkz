package com.xworkz.former.app.boot;

import com.xworkz.former.app.Laptop;
import com.xworkz.former.app.Trainer;

public class TrainerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in TrainerRunner");
		int age=25;
		Laptop laptop=new Laptop();
		Trainer trainer=new Trainer(age);
		trainer.setLaptop(laptop);
		trainer.teach();
		
		

	}

}
