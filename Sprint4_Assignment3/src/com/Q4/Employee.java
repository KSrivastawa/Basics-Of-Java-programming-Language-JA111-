package com.Q4;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	Department department = new Department();

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int employeeId, String employeeName, double employeeSalary, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}


	public final int getEmployeeId() {
		return employeeId;
	}


	public final void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public final String getEmployeeName() {
		return employeeName;
	}


	public final void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public final double getEmployeeSalary() {
		return employeeSalary;
	}


	public final void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", department [departmentId=" + department.getDepartmentId() + ", departmentName="+ department.getDepartmentName() + "]";
	}
	
	
	
	
}
