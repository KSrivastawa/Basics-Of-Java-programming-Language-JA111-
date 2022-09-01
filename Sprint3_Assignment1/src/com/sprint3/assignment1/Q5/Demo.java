package com.sprint3.assignment1.Q5;

import java.util.Scanner;

import javax.xml.transform.Source;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size; int c = 0; int sum = 0; float avg;
		int roll,marks; String name, address;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the required no. of students: ");
		size = sc.nextInt();
		
		Student[] student = new Student[size];
		
		
		for(int i=0; i<student.length; i++) {
			
			System.out.println("Enter Details of Student "+(i+1));
			
			System.out.println("Enter Roll: ");
			roll = sc.nextInt();
			
			System.out.println("Enter Name: ");
			name = sc.next();
			
			System.out.println("Enter Address: ");
			address = sc.next();
			
			System.out.println("Enter Marks: ");
			marks = sc.nextInt();
			
			sum+= marks; // addition of all marks	
			
			System.out.println("Collected Details of Student: " + ++c);
			
			student[i] = new Student();
			student[i].setRoll(roll);
			student[i].setAddress(address);
			student[i].setMarks(marks);
			student[i].setName(name);
			student[i].printDetails();
			
		}
		
		
		
		avg = (float)sum/size;
		System.out.print("Average of all the Student marks "+avg+":");
		
	}

}


