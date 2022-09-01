package com.sprint2.assignment3.Q4;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// zero-argument objects
		Engine obj = new Engine();
		obj.manufacturer = "tata";
		obj.Power = 485;
		obj.rmp = 4785;
		
		Car obj1 = new Car(); 
		obj1.Color = "Red";
		obj1.companyName = "Tata1";
		obj1.model = "Harrier";
		obj1.engine = obj;
		
		// parameterized variables objects
		Engine obj2 = new Engine(47785,145,"tata2");
		Car obj3 = new Car("Harrier2", "Tata2", "White", obj2);
		
		
		obj1.printDetails();
		obj3.printDetails();
	}

}
