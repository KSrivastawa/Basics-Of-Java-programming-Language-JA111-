package com.Q3;

public abstract class Employee {

	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	abstract void calculateSalary();
	
	
	protected int getEmployeeId() {
		return employeeId;
	}


	protected void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	protected String getEmployeeName() {
		return employeeName;
	}


	protected void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	
	protected double getSalary() {
		return salary;
	}

	
	protected void setSalary(double salary) {
		this.salary = salary;
	}


	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	
	
	
}
