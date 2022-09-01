package com.practice;

class Employee3{
	
	double salary;
	String name;
	
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
}

class Square{
	int side;
	
	public int areaS() {
		return side*side;
	}
	public int perimeterS() {
		return 4*side;
	}
	
}

class Rectangle{
	int side;
	int side2;
	
	public int areaR() {
		return side*side2;
	}
	public int perimeterR() {
		return 2*(side+side2);
	}
	
}

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// class Employee3
		/*
		Employee3 obj1 = new Employee3();
		
		obj1.salary = 532014;
		obj1.setName("Ketan Srivastawa");
		
		double salary = obj1.getSalary();
		String name = obj1.getName();
		
		System.out.println("Monthly Income:"+salary+"(in Ruppees)");
		System.out.println("Name: "+name);
		*/
		
		// class Square
		
		Square newObj = new Square();
		newObj.side = 5;
		
		System.out.println(newObj.areaS());
		System.out.println(newObj.perimeterS());
		
		// class Rectangle
		
		Rectangle newObj2 = new Rectangle();
		newObj2.side = 5;
		newObj2.side2 = 7;
		System.out.println(newObj2.areaR());
		System.out.println(newObj2.perimeterR());
		
				
	}

}
