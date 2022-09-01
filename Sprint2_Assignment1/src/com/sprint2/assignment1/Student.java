package com.sprint2.assignment1;

public class Student {

	int roll;
	String name; 
	int marks; 

	void displayStudentDetails() {
		
		System.out.println("Roll is : "+roll);
		System.out.println("Name is : "+name);
		System.out.println("Marks is : "+marks);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Student object1 = new Student(); // creating 1st object of class
		
		object1.roll = 789;
		object1.name = "Ketan";
		object1.marks = 600;
		
		object1.displayStudentDetails();  // calling for 1st object
		
		Student object2 = new Student();  // creating 2nd object of class
		
		object2.roll = 991;
		object2.name = "Srivastawa";
		object2.marks = 750;
		
		object2.displayStudentDetails();  // calling for 2nd object
	
		object1 = null;
		object2 = null;
		
		System.gc();  // calling to garbage collector
		
	
		 		 
		
	}

}
