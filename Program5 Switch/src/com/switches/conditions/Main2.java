package com.switches.conditions;

 import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int num = 10;
		
		if(num == 11) {
			System.out.println("I am 11");
		}
		else {
			System.out.println("I am not 11");
		}
		
		
		
		
		// ==marks calculation===
		
		// assigning variables
		int perSubjectMarks = 200;
		int totalNumberOfSubject = 3;
		int marks1 = 117;
		int marks2 = 37;
		int marks3 = 156;
		
		// percentage of each subject
		int marks1percent = marks1*100/perSubjectMarks;
		int marks2percent = marks2*100/perSubjectMarks;
		int marks3percent = marks3*100/perSubjectMarks;
		
		// percentage of over all marks
		float sumOfTotalMarks = marks1+marks2+marks3;
		float totalmarksPercentage = (sumOfTotalMarks*100)/(totalNumberOfSubject*perSubjectMarks);
		
		System.out.println(totalmarksPercentage+"%");
		
		// 40% over all marks and 33% of each subject marks to pass
		if(totalmarksPercentage >= 40 && marks1percent>=33 && marks2percent>=33 && marks3percent>=33) {
			System.out.println("Congrats You are Passed!");
		}
		else {
			System.out.println("Sorry, You are Failed!");
		}
		
		
		
		
		// ==tax calculation (in Lacs)==
		  
				float income = 20.99f;
				float tax = 0;
			
				// tax applied below 2.5L
			    if(income<2.5) {
					tax = tax + 0;
				}
			    // tax applied 2.5 - 5L
			    else if(income >=2.5 && income<5) {
					tax = tax + (income-2.5f)/100*5;
				}
			    // tax applied 5 - 10L
				else if(income >=5 && income<10) {
					tax = tax + (5.0f-2.5f)/100*5;
					tax = tax + (income-5f)/100*20;
				}
			    // tax applied above 10L
				else {
					tax = tax + (5.0f-2.5f)/100*5;
					tax = tax + (10.0f-5f)/100*20;
					tax = tax + (income-10f)/100*30;
				}
				
			System.out.println("Total tax paid by the Employee is : "+tax+"(in lacs)");
			*/
			
				// ==== Leap year ==== 
		
					int year = 1900;
					
					if( year%400 == 0 ) {
						System.out.println("Yes, "+year+ " is a leap year");
					}
					else if( year%4 == 0 ) {
						System.out.println("Yes, "+year+ " is a leap year");
					}
					else {
						System.out.println("No, "+year+ " is not a leap year");
					}
					
					
					
					
					
			
			// == website feasibily check ==
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Website:");
			String website = sc.next();
			
			if(website.endsWith(".com")) {
				System.out.println("Comercial Website");
			}
			else if(website.endsWith(".org")) {
				System.out.println("Organization Website");
			}
			else if(website.endsWith(".in")) {
				System.out.println("Indian Website");
			}
		
		
		
			
			
			
			
			
	}

}




