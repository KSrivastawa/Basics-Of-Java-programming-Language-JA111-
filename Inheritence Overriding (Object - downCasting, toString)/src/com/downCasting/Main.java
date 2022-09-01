package com.downCasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		A a1 = new A();
		
		
		a1.firstMethodA();
		a1.secondMethodA();
*/		

/*		
		A obj1 = new B(); 
		
		obj1.firstMethodA(); // this is override by class B
		obj1.secondMethodA();
*/		
		
		A obj2 = new B();
		
		B obj3 = (B)obj2;  // =="downCasting"== the object
		
		obj3.firstMethodA();  // this is override by class B
		obj3.secondMethodA();
		obj3.firstMethodB();
		obj3.secondMethodB();

		
	}

}
