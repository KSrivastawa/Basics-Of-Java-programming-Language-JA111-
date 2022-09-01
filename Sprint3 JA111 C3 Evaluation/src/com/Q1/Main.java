package com.Q1;

import java.util.Scanner;

import javax.xml.transform.Source;

public class Main {

	public void changeArray(Object[] arr){
		
		if(arr != null)
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			
		}
		else {
			return;
		}
		
	}
	

	public static void main(String[] args) {

		
		int roll,marks, num; String id, name1,name2,name3; double salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student roll:");
		roll = sc.nextInt();
		
		System.out.println("Enter Student name:");
		name1 = sc.next();
		
		System.out.println("Enter Student marks:");
		marks = sc.nextInt();
		
		System.out.println("Enter Employee id:");
		id = sc.next();
		
		System.out.println("Enter Employee Name:");
		name2 = sc.next();
		
		System.out.println("Enter Employee Salary:");
		salary = sc.nextInt();
		
		System.out.println("Enter StringName:");
		name3 = sc.next();
		
		System.out.println("Enter Number:");
		num = sc.nextInt();
		/*
		Object[] arr = new Object[4];
		arr[0]= new Student(roll, name1, marks+10);
		arr[1]= new Employee(id,name2,salary+10000);
		arr[2]= name3;
		arr[3]= num+20;
		*/
		
		// reversing the string by string builder
		StringBuilder sb = new StringBuilder(name3);
		
		
		Object[] arr = {new Student(roll, name1, marks+10),new Employee(id,name2,salary+10000),sb.reverse(),num+20};
		
		
		Main m1 = new Main();
		
		m1.changeArray(arr);
		
		//System.out.println(m1);
			

	}

}
