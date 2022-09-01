package com.example1;

public interface MyCamera {

	void frontCamera();
	void backCamera();
	
}

interface MyWifi {
	
	void broadBand();
	String[] bandNames();
	int[] amountPerMonth();
}

class SmartPhone {
	
	void highQualityHD() {
		System.out.println("Performing High Quality Video");
	}
	
}

class CellPhone {
	
	void lowQualityHD() {
		System.out.println("Performing low Quality Video");
	}
}


class AllInOne extends SmartPhone implements MyCamera, MyWifi{

	@Override
	public void broadBand() {
		System.out.println("Hello Broad Band");
		
	}

	@Override
	public String[] bandNames() {
		
		String[] str = { "Jio Fiber", "Airtel Fiber", "Wifi Direct" };
		return str;
	}

	@Override
	public int[] amountPerMonth() {
		
		int[] amount = {488, 785, 357};
		return amount;
	}

	@Override
	public void frontCamera() {
		System.out.println("My front Camera having 16px.");
		
	}

	@Override
	public void backCamera() {
		System.out.println("My back Camera having 48px.");
		
	}
	
}


