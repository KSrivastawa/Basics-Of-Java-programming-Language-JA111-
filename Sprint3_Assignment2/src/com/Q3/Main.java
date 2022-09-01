package com.Q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for Employee
		Employee employee = new Employee();
		employee.address = "Siwan";
		employee.age = 45;
		employee.department = "Marketing";
		employee.name = "Rakesh Kumar Singh";
		employee.phoneNumber = "7896325410";
		employee.salary = 3567365.00;
		employee.specialisation = "Backned";
		
		// for Manager
		Manager manager = new Manager();
		manager.address = "Bihar";
		manager.age = 45;
		manager.department = "Marketing";
		manager.name = "Rohit Malohtra";
		manager.phoneNumber = "7896325410";
		manager.salary = 6567365.00;
		manager.specialisation = "Frontened";

		
		// calling print method
		
		manager.printDetails();
		manager.printSalary();
		
		employee.printDetails();
		employee.printSalary();
	}

}
