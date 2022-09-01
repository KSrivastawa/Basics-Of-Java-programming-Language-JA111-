package com.methods;

public class Main2 {
	
	static void pattern(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(); // this for \n line
		}
		
	}
	
	public void patternReverse(int r) {
		for(int i=r; i>=0; i--) {
			for(int j=i; j>=0; j--) {
			System.out.print("#");
		  }
			System.out.println();  // this for \n line
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern(5);
		
		Main2 main2 = new Main2();
		main2.patternReverse(6);
	}

}
