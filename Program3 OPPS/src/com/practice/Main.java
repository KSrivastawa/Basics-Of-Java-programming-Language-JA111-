package com.practice;

class Employee{
	int id;
	String name;
	
	public void Details() {
		System.out.println("Please find my id "+id+" and my name is "+name);
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		
		obj1.id=25;
		obj1.name = "Ketan";
		
		obj2.id = 18;
		obj2.name = "Srivastawa";
		
		obj1.Details();
		obj2.Details();
		
	}

}
