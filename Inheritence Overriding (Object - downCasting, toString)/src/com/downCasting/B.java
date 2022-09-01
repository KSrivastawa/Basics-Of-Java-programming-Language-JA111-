package com.downCasting;

public class B extends A{

	void firstMethodB() {
		System.out.println("First method B");
		
	}
	
	void secondMethodB() {
		System.out.println("Second method B");
		
	}
	
	@Override
	void firstMethodA() {
		System.out.println("First method A in B");
		
	}
	
	
}
