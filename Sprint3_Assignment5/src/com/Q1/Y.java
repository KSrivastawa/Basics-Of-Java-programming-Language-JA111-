package com.Q1;

public interface Y {
	
	public abstract void funYAbstract();

	public default void funYDefault() {
		System.out.println("Hello funYDefault");
	}
	
	public static void funYStatic() {
		System.out.println("hello funYStatic()");
	}

}
