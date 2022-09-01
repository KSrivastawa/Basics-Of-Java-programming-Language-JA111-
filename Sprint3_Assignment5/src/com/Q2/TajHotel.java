package com.Q2;

public class TajHotel implements Hotel {

	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		}

	@Override
	public void chickenBiryani() {
		System.out.println("Welcome to Chicken Briyani at TajHotel");
		
	}

	@Override
	public void masalaDosa() {
		System.out.println("Welcome to Masala Dosa at TajHotel");
		
	}

}
