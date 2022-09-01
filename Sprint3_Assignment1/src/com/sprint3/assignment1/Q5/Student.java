package com.sprint3.assignment1.Q5;

public class Student {

	private int roll;
	private String name;
	private String address;
	private int marks;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	void printDetails() {
		System.out.println("Student Roll: "+getRoll());
		System.out.println("Student Name: "+getName());
		System.out.println("Student Address: "+getAddress());
		System.out.println("Student Marks: "+getMarks());
		
		System.out.println("=============================");
	}
	
}
