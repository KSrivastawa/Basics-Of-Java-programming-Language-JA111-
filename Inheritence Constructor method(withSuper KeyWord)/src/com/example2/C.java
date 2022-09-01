package com.example2;

public class C extends B {

	int y;
	
	C(){
		System.out.println("Hello Cons C");
	}
	
	C(int x){
		super(x);
		System.out.println("Hello Cons C parameterized value:" + x);
	}
	
	C(int x, int y){
		super(x,y);
		System.out.println("Hello Cons C parameterized-2 value:" + (x+y));
	}
}
