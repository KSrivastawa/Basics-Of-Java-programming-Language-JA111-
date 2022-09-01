package com.practice;

class Employee2{
	int id;
	int salary;
	String name;
	
	public void printDetails() {
		System.out.println("My ID is "+id);
		System.out.println("My Name is "+name);
	}
	
	public int getSalary() {
		return salary;
	}
	
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 obj1 = new Employee2();
		Employee2 obj2 = new Employee2();
		
		obj1.id = 19;
		obj1.salary = 5000;
		obj1.name = "Ketan Srivastawa";
		
		obj2.id = 23;
		obj2.salary = 6500;
		obj2.name = "Prashant Kumar";
		
		obj1.printDetails();
		obj2.printDetails();
		
		int salary1 = obj1.getSalary();
		int salary2 = obj2.getSalary();
		
		System.out.println(salary1);
		System.out.println(salary2);
	}

}
