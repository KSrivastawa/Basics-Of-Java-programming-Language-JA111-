package com.Q3;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	
	
	public final int getHoursWorked() {
		return hoursWorked;
	}

	public final void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public final int getHourlyWages() {
		return hourlyWages;
	}

	public final void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	

	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}

	@Override
	void calculateSalary() {
		salary = hoursWorked * hourlyWages;
		
		System.out.println(salary);
		
	}

}



