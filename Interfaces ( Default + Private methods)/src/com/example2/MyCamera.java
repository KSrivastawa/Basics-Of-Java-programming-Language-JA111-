package com.example2;

public interface MyCamera {

	void frontCamera();
	void backCamera();
	
	private void popUp() {
		System.out.println("\nHigh Definition - Private popup.");
	}
	default void linerCam() {
		popUp();
		System.out.println("\nThis is Default linear cam.");
	}
	
}

interface MyWifi {
	
	void broadBand();
	String[] bandNames();
	int[] amountPerMonth();
}

class SmartPhone {
	
	void highQualityHD() {
		System.out.println("\nPerforming High Quality Video");
	}
	
}

class CellPhone {
	
	void lowQualityHD() {
		System.out.println("\nPerforming low Quality Video");
	}
	void callConnecting() {
		System.out.println("\nCall cnnecting through Cell Phone...");
	}
}


class AllInOne extends CellPhone implements MyCamera, MyWifi{

	@Override
	public void broadBand() {
		System.out.println("\nHello Broad Band");
		
	}

	@Override
	public String[] bandNames() {
		
		String[] str = { "\nJio 2G", "Airtel 3G", "Wifi Direct" };
		return str;
	}

	@Override
	public int[] amountPerMonth() {
		
		int[] amount = {188, 285, 157};
		return amount;
	}

	@Override
	public void frontCamera() {
		System.out.println("\nMy front Camera not available");
		
	}

	@Override
	public void backCamera() {
		System.out.println("\nMy back Camera having 2.0px.");
		
	}
	
}


