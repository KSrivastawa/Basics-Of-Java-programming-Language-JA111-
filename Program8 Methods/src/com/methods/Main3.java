package com.methods;


// sum by recursion
public class Main3 {

	static int recursive(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n+recursive(n-1);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = recursive(7);
		System.out.println(r);
	}

}


