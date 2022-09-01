package com.sprint2.assignment4;

import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;

	public void displayCourseDetails() {
		System.out.println("Cousre Id: " + courseId);
		System.out.println("Cousre Name: " + courseName);
		System.out.println("Cousre Fee: " + courseFee);
		System.out.println();  // for next line space
	}
	
	public static void authenticate( String username, String password ){
		if( username.equals("Admin") && password.equals("1234")) {
			
			Course obj = new Course();
			obj.courseId = 044;
			obj.courseName = "Backend Java";
			obj.courseFee = 764360;
			
			obj.displayCourseDetails();
		}
		
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User Name:");
		x = sc.next();
		
		System.out.println("Enter Password:");
		y = sc.next();
		
		Course.authenticate(x, y);
		
		
		System.out.println("Enter User Name:");
		x = sc.next();
		
		System.out.println("Enter Password:");
		y = sc.next();
		
		Course.authenticate(x, y);
		
	}

}



