package com.sprint2.assignment3.Q1;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student obj1 = new Student();
		obj1.setRoll(587);;
		obj1.setName("Prashant");
		obj1.setAge(43);
		obj1.setMarks(335);
				
		Student obj2 = new Student(896,"Ketan",25,437);
		
		// calling methods
		obj1.printDetails();
		obj2.printDetails();
		
	}
}
