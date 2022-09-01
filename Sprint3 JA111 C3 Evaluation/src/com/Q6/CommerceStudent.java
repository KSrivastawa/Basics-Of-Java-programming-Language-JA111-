package com.Q6;

public class CommerceStudent implements Student {

	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;
	
	
	public final int getAccountMarks() {
		return accountMarks;
	}
	public final void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}
	public final int getEconomicsMarks() {
		return economicsMarks;
	}
	public final void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}
	public final int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}
	public final void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}
	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

	
}
