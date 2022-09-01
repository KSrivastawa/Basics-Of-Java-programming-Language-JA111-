package com.Q1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Z z1 = new Zlmpl();  // upCasting object
		
		z1.funXAbstract();
		z1.funXDefault();
		z1.funYAbstract();
		z1.funYDefault();
		z1.funZAbstract();
		
		X.funXStatic();  // this static method
		Y.funYStatic();  // this static method
		
	}

}
