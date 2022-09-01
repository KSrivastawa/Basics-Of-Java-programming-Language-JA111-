package com.Q4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int roll, marks; String name;
		int roll2, marks2; String name2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student 1 Details:");
		
		System.out.println("Enter Roll:");
		roll = sc.nextInt();
		
		System.out.println("Enter Name:");
		name = sc.next();
		
		System.out.println("Enter Marks:");
		marks = sc.nextInt();
		
		
		System.out.println("Enter Student 2 Details:");
		
		System.out.println("Enter Roll:");
		roll2 = sc.nextInt();
		
		System.out.println("Enter Name:");
		name2 = sc.next();
		
		System.out.println("Enter Marks:");
		marks2 = sc.nextInt();
		
		
		Student student1 = new Student(roll, name, marks);
		student1.displayDetails();
		System.out.println();
		
		Student student2 = new Student(roll2, name2, marks2);
		student2.displayDetails();
		
		
		
		
	}

}






