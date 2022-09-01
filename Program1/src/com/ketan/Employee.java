package com.ketan;


public class Employee {
	String empId;
	String name;
	double salary;
	
//zero argument constructor
	public Employee() {
		empId="Emp-01";
		name= "Ramesh";
		salary = 50000.00;
	}
	
//overloaded parameterized constructor
	public Employee(String empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void showDetails() {
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+name);
		System.out.println("Salary is :"+salary);
		}
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.showDetails();
		
		Employee emp2=new Employee("Emp-02", "Dinesh", 40000.00);
		emp2.showDetails();
		
	}
	
}




