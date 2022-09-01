package com.Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfPassenger, numberOfKms;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of Passenger:");
		numberOfPassenger = scanner.nextInt();
		
		System.out.println("Enter Number of Kms:");
		numberOfKms = scanner.nextInt();
		
		
		OLA myOla = new OLA();
		
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		
		int res = myOla.calculateBill(myCar);
		
		System.out.println("The total fare amount is "+ res);

	
	}

}
