package com.sprint2.assignment3.Q3;

public class Student {

	int roll; 
	String name;
	String address; 
	String collageName;

	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = "NIT";
	}

	
	public Student(int roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCollageName() {
		return collageName;
	}


	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}


	public static Student getStudent(boolean isFromNIT) {
				
		if(isFromNIT == true) {
			
			return new Student( 357, "Ketan", "Bihar");
		}
		
		else {
			
			return new Student( 485, "Ketan", "Bihar", "D A V");
		}
		
	}
	
	public void printDetails() {
		System.out.println("Roll No.: "+ getRoll());
		System.out.println("Name: "+ getName());
		System.out.println("Address: "+ getAddress());
		System.out.println("Collage Name: "+ getCollageName());
		System.out.println();  // for next line space
	}
	

}






