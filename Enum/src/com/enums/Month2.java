package com.enums;

public enum Month2 {

	JAN,FEB(2),MAR,APR,MAY(5);
	
	Month2(){
		
		System.out.println("inside constructor of Month2 ");
		
	}
	
	Month2(int num) {
		System.out.println("isnide constructor of Month2(int num)");
	}
	
}


/*
--here for FEB and MAY, parameterized constructor and for remaining zero
argument constructor will be executed.
*/
