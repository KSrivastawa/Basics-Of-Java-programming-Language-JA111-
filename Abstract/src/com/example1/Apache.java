package com.example1;

public class Apache extends Bike{

	@Override
	void run() {
		System.out.println("running safely");
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b1 = new Apache();
		b1.run();
		
	}

}
