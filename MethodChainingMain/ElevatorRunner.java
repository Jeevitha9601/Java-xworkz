package MethodChainingMain;

import MethodChaining.Elevator;

public class ElevatorRunner {

	public static void main(String[] args) {
		Elevator elevator=new Elevator();
		elevator.elevatorInfo("uo-down",43);
		elevator.elevatorInfo();

	}

}
