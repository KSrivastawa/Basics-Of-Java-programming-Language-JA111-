package com.sprint2.assigment2.Q3;

public class Shape {

	
	public void area(Circle circle) {
		
		System.out.println("Area of Circle: "+circle.radius*circle.radius);
	};
	
	
    public void area(Rectangle rectangle) {
	    	
    	System.out.println("Area of Rectangle: "+rectangle.breadth*rectangle.length);
    };
    
    
    public void area(Square square) {
    		
    	System.out.println("Area of Square: "+square.side*4);
    };


}
