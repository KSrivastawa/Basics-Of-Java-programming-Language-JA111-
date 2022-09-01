package com.problem1.classes.objects;

public class Employee {

	String empId;
	String empName;
	double salary;
	
	Address address = new Address();

	public void showDetails(){
		
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+salary);
		System.out.println("Employee Address :");
		address.printAddress();
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.showDetails();  // at this place each values are null/0 - because values are not assigned yet till this point. 
		
		System.out.println("------------------");
		
		Employee employee = new Employee();
		
		employee.empId = "Emp-09";
		employee.empName = "Ketan";
		employee.salary = 1000.00;
		employee.address.city = "Siwan";
		employee.address.state = "Bihar";
		employee.address.pincode = "841226";
		
		employee.showDetails();
	}

}
