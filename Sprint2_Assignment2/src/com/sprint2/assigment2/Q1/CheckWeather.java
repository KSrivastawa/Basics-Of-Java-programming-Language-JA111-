package com.sprint2.assigment2.Q1;

public class CheckWeather {
	
	
	public void check(boolean isSnowing, boolean isRaining, double temperature){
		
		if(isSnowing == true || isRaining == true || temperature < 50.0) {
			System.out.println("Let’s stay home.");
		}
		else {
			System.out.println("Let’s go out!");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isSnowing = true;
		boolean isRaining = false;
		double temperature = 80.0;
		
		
		CheckWeather obj = new CheckWeather();
		
		obj.check(isSnowing,isRaining,temperature);

		
	}

}
