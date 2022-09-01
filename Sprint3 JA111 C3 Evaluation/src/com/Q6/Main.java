package com.Q6;

import java.util.Scanner;

public class Main {

	public static double getStudent(int choice) {
		//choice=0;
		if(choice == 1) {
		
			ArtStudent a1 = new ArtStudent();
			
			double x = a1.findPercentage();
			return x; 
			
		}
		else { 
			return 0;
		}
		
		
		
	}

	
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Student percentage do you want to find:\r\n"
				+"1. ArtStudent\r\n"+"2. ScienceStudent\r\n"
						+ "3. CommerceStudent");
		number = sc.nextInt();

		Main ma1 = new Main();
		ma1.getStudent(number);
		
		if(number ==  1) {
		int m1,m2,m3;
		
		System.out.println("Enter the Marks for English:");
		m1 = sc.nextInt();
		System.out.println("Enter the Marks for Hindi:");
		m2 = sc.nextInt();
		System.out.println("Enter the Marks for History:");
		m3 = sc.nextInt();
		
		ArtStudent a1 = new ArtStudent();
		
		a1.setEnglishMarks(m1);
		a1.setHindiMarks(m2);
		a1.setHistoryMarks(m3);
		
		}
		else if(number ==  2) {
			int m1,m2,m3,m4;
			
			System.out.println("Enter the Marks for Maths:");
			m1 = sc.nextInt();
			System.out.println("Enter the Marks for Physics:");
			m2 = sc.nextInt();
			System.out.println("Enter the Marks for Chemistry:");
			m3 = sc.nextInt();
			System.out.println("Enter the Marks for Biology:");
			m4 = sc.nextInt();
			
			ScienceStudent a1 = new ScienceStudent();
			
			a1.setMathsMarks(m1);
			a1.setPhysicsMarks(m2);
			a1.setChemistryMarks(m3);
			a1.setBiologyMarks(m4);
			
			}
		
		System.out.println(ma1.getStudent(number));
				
		
	}

}









