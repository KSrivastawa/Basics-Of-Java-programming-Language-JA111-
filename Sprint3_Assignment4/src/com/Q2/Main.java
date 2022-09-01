package com.Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfEmployee;
		int sum=0;
		float avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total no.of employees:");
		numberOfEmployee = sc.nextInt();
		
		int[] age = new int[numberOfEmployee];
		
		if(age.length>=2) {
			
			System.out.println("Enter the age for " +age.length+" employees:");
			
		for(int i=0; i<age.length; i++) {
				
				age[i]= sc.nextInt();
			}
			
		for(int i=0; i<age.length; i++) {
			
			sum+= age[i];
			
			avg = (float)sum/age.length;
			
			}
			System.out.println("Average of the Employees age: "+avg);
			
		}
		
		else {
			System.out.println("Please enter a valid employee count");
		}

		
		
	}

}
