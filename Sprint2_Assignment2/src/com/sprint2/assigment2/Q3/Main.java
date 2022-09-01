package com.sprint2.assigment2.Q3;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shapes = new Shape();
		
	// creating class object for Circle,Rectangle and Square classes.
		Circle object = new Circle();
		object.radius = 8;
		
		Rectangle object2 = new Rectangle();
		object2.length = 8;
		object2.breadth = 5; 
		
		Square object3 = new Square();
		object3.side = 8;
		
		
		shapes.area(object);
		shapes.area(object2);
		shapes.area(object3);
		
		
	}

}
