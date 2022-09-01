package com.methods;

// Var-args concept used -- 
public class Main5 {
	
	static float averageNumber(int ...n) {
		// available in terms of Array = int [] n;
		
		float avg = 0;
		for(int i=0; i<n.length; i++) {
			avg = avg + n[i];
		}
		return avg/n.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 = 52;
		int a2 = 38;
		int a3 = 67;
		int a4 = 78;
		
		float result = averageNumber(a1,a2,a3,a4);
		
		// this is the beauty of var-args concept 
		float result2 = averageNumber(4,8,9,3);  
		// we can make different uses in multiple cases.
		
		System.out.println(result);
		System.out.println(result2);
	}

}
