package com.Q4;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public void displayDetails() {
		
		Student student = new Student(roll, name, marks);
		char x = student.calculateGrade();
		
		System.out.println("Student Details=>");
		System.out.println("Roll: "+getRoll());
		System.out.println("Name: "+getName());
		System.out.println("Marks: "+getMarks());
		System.out.println("Grade is "+x);
		
	}
	
	private char calculateGrade() {

		if(marks >= 500) {
			return grade = 'A';
		}
		
		else if(marks >= 400 && marks <500) {
			return grade = 'B';
		}
		
		else if(marks <400) {
			return grade = 'C';
		}

		else {
			return grade;
		}
		
	}
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;

	}
	
	
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

	
	
}
