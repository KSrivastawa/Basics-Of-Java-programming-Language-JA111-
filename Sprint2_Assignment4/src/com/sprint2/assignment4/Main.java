package com.sprint2.assignment4;

import java.util.Scanner;

// Q2) Write a Java program to get the character at the given index within
// the String. Take the input with the help of Scanner class.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;
		int y;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter The String:");
		x = sc.next();
		
		System.out.println("Enter the character position you want to access:");
		y = sc.nextInt();		
		
		System.out.println("Character at position "+ y +" is :");

		System.out.println(x.charAt(y));
		
	}

}
