package com.Q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area area = new Area();
		
		int y = area.rectangleArea(9, 9);
		System.out.println("Area of Rectangle: "+y);
		
		int z = area.squareArea(9);
		System.out.println("Area of Square: "+z);
		
		int x = area.circleArea(9);
		System.out.println("Area of Circle: "+x);
		
		
	}

}
