package com.c2evaluation.Q2;

public class Student {

	private int rollNumber;
	private String studentName;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String studentName, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	void printDetails() {
		
		System.out.println("Student Roll Number:"+getRollNumber());
		System.out.println("Student Roll Number:"+getStudentName());
		System.out.println("Student Roll Number:"+getMarks());
		System.out.println("=============================");
		
	}
	
}






