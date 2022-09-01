package com.Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String string; int index;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String =>");
		string = sc.next();
		
		System.out.println("Enter a position =>");
		index = sc.nextInt();
		
		for(int i=0; i<string.length(); i++) {
		if(index < string.length()) {
			char in = string.charAt(index);
			System.out.println(in);
			break;
		}
		else {
			System.out.println("Invalid position, Please enter a valid position =>");
			index = sc.nextInt();
		
		}
		
	   }
		
	}

}
