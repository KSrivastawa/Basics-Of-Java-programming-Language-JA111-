package com.c2evaluation.Q3;

public class Ticket {
	
	int ticketid;
	int price;
	static int availableTickets;
	int totalAmount;

	public int calculateTicketCost(int noOfTickets) {		
		
		if(noOfTickets>0) {
			totalAmount = noOfTickets*price;			
			availableTickets = availableTickets - noOfTickets;
			return totalAmount;
		}
		
		else {
			return -1;
		}
		
		
	}
	
	void printDetails() {
		System.out.println("Total amount: "+totalAmount);
		System.out.println("Available ticket after booking: " +availableTickets);
	}

}
