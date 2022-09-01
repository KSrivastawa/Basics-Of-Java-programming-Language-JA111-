package com.toString;

public class BankDetails {

	String name;
	String accountNumber;
	double balance;
	
	
	public BankDetails(String name, String accountNumber, double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "BankDetails [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	

}
