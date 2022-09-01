package com.Q3;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		int area = 2*(length*breadth);
		return area;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int area = side*4;
		
		return area;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		int area = radius*radius;
		
		return area;
	}

	
}
