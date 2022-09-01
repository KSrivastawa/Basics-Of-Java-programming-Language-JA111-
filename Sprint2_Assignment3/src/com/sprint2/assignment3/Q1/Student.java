package com.sprint2.assignment3.Q1;

public class Student {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	// applying getter and setter method
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	// for zero-argument constructor
	public Student(){
	
	};

	// for parameterized constructor
	public Student(int roll, String name, int age, int marks) {
	
		this.roll = roll;
		this.name = name; 
		this.age = age;
		this.marks = marks;
		
	};
	
	public void printDetails() {
		
		if(18 < age && age < 60 && 0 < marks && marks < 500) {
			
			System.out.println("Student Roll No.: "+ getRoll());
			System.out.println("Student Name: "+ getName());
			System.out.println("Student Age: "+ getAge());
			System.out.println("Student Marks: "+ getMarks());
			System.out.println(); // this is for separation of the object details
		}
	}

}

