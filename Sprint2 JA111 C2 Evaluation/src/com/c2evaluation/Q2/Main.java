package com.c2evaluation.Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int rollNumber; String name; int marks; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Students you want to enter");
		number = sc.nextInt();
		
		System.out.println("Enter the Roll Number :");
		rollNumber = sc.nextInt();
		
		System.out.println("Enter the Name :");
		name = sc.next();
		
		System.out.println("Enter the marks :");
		marks = sc.nextInt();
		
		
		System.out.println("Student Detail " + number);
		
		Student obj = new Student(rollNumber, name, marks);
		
		obj.printDetails();
		
		
	}

}
