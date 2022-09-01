package com.c2evaluation.Q5;

public class Employee {

	int employeeId;
	String employeeName;
	double salary;
	double netSalary;
	
	
	
	public Employee(int employeeId, String employeeName, double salary, double netSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.netSalary = netSalary;
	}



	public void calculateNetSalary(int pfPercentage) {
		
		netSalary=salary-pfPercentage*salary;
		System.out.println(netSalary);

	}
	
}
