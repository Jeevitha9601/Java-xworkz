package OverridingMain;

import OverRiding.Conductor;
import OverRiding.Ticket;

public class TicketRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in TicketRunner ");
		Ticket ticket=new Conductor();
		ticket.paper();
	}

}
