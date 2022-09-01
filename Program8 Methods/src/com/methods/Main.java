package com.methods;

public class Main {

	public void multiplicationTable(int n) {
		
		System.out.println("Multiplication of "+n);
		for(int i=1; i<=10; i++) {
			// System.out.println(n*i);
			
			System.out.format("%d X %d: %d\n", n,i, n*i );
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.multiplicationTable(13);
		
	}

}
