package com.sprint2.assignment3.Q4;

public class Car {

	String model;
	String companyName;
	String Color;
	Engine engine;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String model, String companyName, String color, Engine engine) {
		super();
		this.model = model;
		this.companyName = companyName;
		Color = color;
		this.engine = engine;
		
	}
	
	
	public void printDetails() {
		
		System.out.println("Car Model: " + model);
		System.out.println("Car companyName: " + companyName);
		System.out.println("Car color: " + Color);
		System.out.println("Car RPM: " + engine.rmp);
		System.out.println("Car power: " + engine.Power);
		System.out.println("Car manufacture: " + engine.manufacturer);
		System.out.println("Car Has Turbo: " + engine.hasTurboEnability());
		System.out.println(); // for next line space
		
	}

	
}
