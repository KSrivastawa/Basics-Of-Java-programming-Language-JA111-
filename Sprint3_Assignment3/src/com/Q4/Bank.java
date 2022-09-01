package com.Q4;

public class Bank {

	int x;
	
	private Bank(){
	      System.out. println("Inside private constructor of Bank");
	   }
	
	/*  this first way---
	Bank(int x){
		Bank b1 = new Bank();
	}
*/
	
	// this second way ---
	
	public static void x() {
		Bank b1 = new Bank();
	}
	
}
