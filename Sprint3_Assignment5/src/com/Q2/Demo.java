package com.Q2;

public class Demo {

	public Hotel provideFood(int amount) {
		Hotel hotel = null;
		
		if(amount > 1000) {
			hotel = new TajHotel();
		}
		else if(amount > 200 && amount <= 1000) {
			hotel = new RoadSideHotel();
		}
		
		
		return hotel;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Demo d1 = new Demo();
		// d1.provideFood(600);
		
		Hotel h1 = d1.provideFood(1110);
		
		if(h1 != null) {
	
			if(h1 instanceof TajHotel) {
				
				TajHotel t1 = (TajHotel)h1;
				t1.welcomeDrink();
			}
			else if(h1 instanceof RoadSideHotel) {
				
				RoadSideHotel r1 = (RoadSideHotel)h1;
				r1.welcomeDrink();
			}
			
			h1.chickenBiryani();
			h1.masalaDosa();
			
		
		}
		else {
			System.out.println("Please Enter a valid amount");
		}
		
		
	}

}
