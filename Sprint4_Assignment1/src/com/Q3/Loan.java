package com.Q3;

public class Loan {
	

	public double calculateLoanAmount(Employee employeeObj) {
		double x =0;
		//employeeObj.calculateSalary();
		
		if(employeeObj instanceof PermanentEmployee) {
			
			double loanAmount = (0.15)* employeeObj.getSalary() ;
			return loanAmount;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			
			double loanAmount = (0.1)* employeeObj.getSalary() ;
			return loanAmount;
		}
		else {
			return x;
		}
	}
	
	
	
}
