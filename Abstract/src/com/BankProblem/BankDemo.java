package com.BankProblem;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank1 = new SBI();
		System.out.println("Rate of Interest of PNB is: "+bank1.getRateOfInterest()+" %");

		Bank bank2 = new HDFC();
		System.out.println("Rate of Interest of PNB is: "+bank2.getRateOfInterest()+" %");

		Bank bank3 = new ICIC();
		System.out.println("Rate of Interest of PNB is: "+bank3.getRateOfInterest()+" %");

	}

}
