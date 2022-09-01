package com.Q1;

public class OLA {


	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		Car obj = null;
		
		if(numberOfPassenger <= 3) {
			obj = new HatchBack();
			obj.setNumberOfKms(numberOfKMs);
		}
		
		else {
			obj = new Sedan();
			obj.setNumberOfKms(numberOfKMs);
		}
		
		return obj;
	}
	
	public int calculateBill(Car car) {
		
		if(car instanceof HatchBack) {
			HatchBack h1 = (HatchBack)car;
			int totalFare = h1.getNumberOfKms()* h1.farePerKm;
			
			return totalFare;
		}
		else {
			Sedan s1 = (Sedan)car;
			int totalFare = s1.getNumberOfKms()* s1.farePerKm;
			
			return totalFare;
		}
		
				
	}
}
