package com.example2;

public class B extends A {

	
	B(){
		System.out.println("Hello Cons B");
	}
	
	B(int x){
		System.out.println("Hello Cons B parameterized value:" + x);
	}
	
	B(int x, int y){
		System.out.println("Hello Cons B parameterized value:" + Math.abs(x-y));
	}
}
