package com.c2evaluation.Q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bookings, availableTickets, ticketId, price, tickets;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of bookings:");
		bookings = sc.nextInt();
		System.out.println(); //  for next line spacing
		
		System.out.println("Enter the available tickets:");
		availableTickets = sc.nextInt();
		System.out.println(); //  for next line spacing
		
		System.out.println("Enter the ticketid:");
		ticketId = sc.nextInt();
		
		System.out.println("Enter the price:");
		price = sc.nextInt();
		
		System.out.println("Enter the no of tickets:");
		tickets = sc.nextInt();
		
		
		
		Ticket obj = new Ticket();
		obj.price = price;
		obj.availableTickets = availableTickets;
		System.out.println("Available tickets: "+availableTickets);
		obj.calculateTicketCost(tickets);
		
		obj.printDetails();
	}

}










