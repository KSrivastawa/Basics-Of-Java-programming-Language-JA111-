package com.Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	List<Employee> employee = new ArrayList<>();
	
	public List<Employee> collectionOfEmployee(Employee emp) {
		
		employee.add(emp);
		
		return employee;
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Main m1 = new Main();
		
		System.out.println("...Welcome to Employee Management System....");
		
		int count = 1;
		while(true) {
			
			System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("Y")) {
			
				System.out.println("Enter the Employee Details: "+count++ +"\n---------------------------------------------");
				System.out.println("Enter the Employee Id:");
				int id = sc.nextInt();
				
				System.out.println("Enter the Employee Name:");
				String name = sc.next();
				
				System.out.println("Enter the Employee Salary:");
				double salary = sc.nextDouble();
				
				System.out.println("Enter the Department Id:");
				int d_Id = sc.nextInt();
				
				System.out.println("Enter the Department Name:");
				String d_Name = sc.next();
				
				System.out.println("Employee Details added successfully..");
				
				Department depart = new Department(d_Id, d_Name);
				
				Employee employee1 = new Employee(id, name, salary, depart);
				
				m1.employee.add(employee1);
			
			}
			else if(choice.equalsIgnoreCase("N")) {
				System.out.println("Thank you---");
				System.out.println("Enter the your choice\r\n"
						+ "1: Find Employee in Particular Department\r\n"
						+ "2: Remove Particular Employee\r\n"
						+ "3: Print Employees in All Departments");
				int choice2 = sc.nextInt();
				
				if(choice2 == 1) {
					System.out.println("Enter the Department Id:");
					int d_id2 = sc.nextInt();
					
					System.out.println("Employee in Department: "+d_id2);
					
					for(int i=0; i<m1.employee.size(); i++) {
						
						if(m1.employee.get(i).department.getDepartmentId() == d_id2) {
						
							System.out.println("Employee Name: "+m1.employee.get(i).getEmployeeName());
							System.out.println("Employee Id: "+m1.employee.get(i).getEmployeeId());
							System.out.println("Employee Salary: "+m1.employee.get(i).getEmployeeSalary());
							System.out.println("===============================");
					}
				  }
				}
				
				
				
				
				else if(choice2 == 2) {
					System.out.println("Enter the Department Id:");
					int d_id3 = sc.nextInt();
					
					System.out.println("Enter the Employee Id:");
					int id = sc.nextInt();
					
					for(int i=0; i<m1.employee.size(); i++) {
						if(m1.employee.get(i).department.getDepartmentId() == d_id3) {
							if(m1.employee.get(i).getEmployeeId()== id) {
								
								System.out.println("Employee "+m1.employee.get(i).getEmployeeName() +" is removed from the department "+ d_id3 +" successfully.");
								m1.employee.remove(i);
								
						}
					}
				  }
					
				}
				
				
				
				else if(choice2 ==3) {
					for(int i=0; i<m1.employee.size(); i++) {
						System.out.println(m1.employee.get(i));
						System.out.println("--------------------------");
					}
				}
				
				
				
				
				
				System.out.println("Do you want to Exit: ? (Y/N)");
				String choice3 = sc.next();
				if(choice3.equals("Y")) {
					System.out.println("Thank you---");
					break;
				}
				
				
				else if(choice3.equalsIgnoreCase("N")) {
					System.out.println("Enter the your choice\r\n"
							+ "1: Find Employee in Particular Department\r\n"
							+ "2: Remove Particular Employee\r\n"
							+ "3: Print Employees in All Departments\r\n"
							+ "");
					int choice4 = sc.nextInt();
					
					if(choice4 == 1) {
						System.out.println("Enter the Department Id:");
						int d_id2 = sc.nextInt();
						
						System.out.println("Employee in Department: "+d_id2);
						
						for(int i=0; i<m1.employee.size(); i++) {
							if(m1.employee.get(i).department.getDepartmentId() == d_id2) {
							System.out.println("Employee Name: "+m1.employee.get(i).getEmployeeName());
							System.out.println("Employee Id: "+m1.employee.get(i).getEmployeeId());
							System.out.println("Employee Salary: "+m1.employee.get(i).getEmployeeSalary());
							System.out.println("===============================");
						}
					  }
					}
					
					
					
					
					else if(choice4 == 2) {
						System.out.println("Enter the Department Id:");
						int d_id3 = sc.nextInt();
						
						System.out.println("Enter the Employee Id:");
						int id = sc.nextInt();
						
						for(int i=0; i<m1.employee.size(); i++) {
							if(m1.employee.get(i).department.getDepartmentId() == d_id3) {
								if(m1.employee.get(i).getEmployeeId()== id) {
									
									System.out.println("Employee "+m1.employee.get(i).getEmployeeName() +" is removed from the department "+ d_id3 +" successfully.");
									m1.employee.remove(i);
									
							}
						}
					  }
						
						
					}
					
					
					
					
					else if(choice4 ==3) {
						for(int i=0; i<m1.employee.size(); i++) {
							System.out.println(m1.employee.get(i));
							System.out.println("--------------------------");
						}
					}
				}
			}
		}
		
	}

}









