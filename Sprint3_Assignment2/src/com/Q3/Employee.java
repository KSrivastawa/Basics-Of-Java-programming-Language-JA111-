package com.Q3;

public class Employee extends Member{
	
	String specialisation;
	String department;

	void printDetails() {
		System.out.println();
		System.out.println("Employee Details=>");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Address: "+address);
		System.out.println("Specialisation: "+specialisation);
		System.out.println("Department: "+department);

		
	}

}
