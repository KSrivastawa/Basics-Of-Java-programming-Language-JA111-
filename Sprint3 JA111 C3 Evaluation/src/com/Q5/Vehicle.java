package com.Q5;

public interface Vehicle {

	void run();
	
	default void service() {
		System.out.println("Car needs service");
	}
	
}




