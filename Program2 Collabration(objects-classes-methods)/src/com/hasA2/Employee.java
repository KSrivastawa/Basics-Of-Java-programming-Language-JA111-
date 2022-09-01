package com.hasA2;

public class Employee {

	String empId;
	String empName;
	double salary;

	// //defining Address class as a static member
	static Address address;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj = new Employee();
		
		// At the initial stage(before assigned any value- result will be:
		System.out.println(obj);   // com.hasA.Employee@cac736f
		System.out.println(obj.empId);  // null
		System.out.println(obj.empName);  // null
		System.out.println(obj.salary); // 0.0
		System.out.println(Employee.address); // null
		
		
		Employee obj1 = new Employee();
		
		// After assigned values:
		
		obj1.empId = "Emp-53";
		obj1.empName = "Ketan";
		obj1.salary = 10000.00;
		
		Employee.address = new Address();  // this done with help of has-A collaboration object/method
		//address = new Address(); //within the same class we can access the static members directly
		//emp2.address=new Address(); we can access the static members with the help of object also
		System.out.println(Employee.address); // here got the address: com.hasA.Address@26f0a63f
		
		Employee.address.city = "Siwan";
		Employee.address.state = "Bihar";
		Employee.address.pincode = "841226";
		
		// consoling each object values:
		System.out.println(obj1.empId);   // Emp-53
		System.out.println(obj1.empName); // Ketan
		System.out.println(obj1.salary);  // 10000.0
		System.out.println(Employee.address.city); // Siwan
		System.out.println(Employee.address.state); // Bihar
		System.out.println(Employee.address.pincode); // 841226
		
		
		
	}

}
