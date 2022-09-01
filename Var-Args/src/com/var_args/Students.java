package com.var_args;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students {
	
	int roll;
	String name;
	int marks;
	
	public Students() {
		
	}

	public Students(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		
	}
	
		

	@Override
	public String toString() {
		return "\nStudents [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
	public static void studentObjects(Students... students ) {
		
		List<Students> list = new ArrayList<>();
		
		for(int i=0; i<students.length; i++) {
		
			list.add(students[i]);

		}
		
		System.out.println(list);
	
		
	}
	
	

	public static void main(String[] args) {

		Students[] students = {
				new Students(56, "Prashant", 985),
				new Students(47, "Prashant", 755),
				new Students(96, "Prashant", 385)
		};
		
		// ---calling method---
		studentObjects( students );
		
		
	}

}
