package com.example1;

public class Main {

	public static void main(String[] args) {
		
		PrintDetails.accessDetails(new A());
		PrintDetails.accessDetails(new B());		
		//PrintDetails.accessDetails(null);  // gives null pointer exception
		
	}
}
