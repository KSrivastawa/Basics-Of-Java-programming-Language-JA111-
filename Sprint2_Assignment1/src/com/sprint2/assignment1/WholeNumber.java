package com.sprint2.assignment1;

public class WholeNumber {

	void printValues(int n) {
		
		if(n>0 && n%2==1) {
			System.out.println(n);
		}
		else if(n>=0 && n%2==0 ) {
			int x = (n + 9) / 10;
			System.out.println(x*10);
		}
		else if(n<0) {
			System.out.println("Error");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 155;
		
		WholeNumber wholeNumber = new WholeNumber();
		wholeNumber.printValues(a);
	
	}



}
