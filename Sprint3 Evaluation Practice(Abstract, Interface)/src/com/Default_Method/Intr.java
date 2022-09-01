package com.Default_Method;

public interface Intr {

	void method1();
	
	default void method2() {
		System.out.println("Hello I am Default!");
	}
	
	static void method3() {
		System.out.println("Hello I am Static!");
	}
}

class A implements Intr {

	@Override
	public void method1() {
		System.out.println("Interface implementation!");		
	}
	
}
