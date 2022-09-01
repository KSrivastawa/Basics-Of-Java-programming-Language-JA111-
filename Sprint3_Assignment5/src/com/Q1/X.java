package com.Q1;

public interface X {

	public abstract void funXAbstract();

	public default void funXDefault() {
		System.out.println("Hello funXDefault");
	}
	
	public static void funXStatic() {
		System.out.println("Hello funXStatic()");
	}
	
}
