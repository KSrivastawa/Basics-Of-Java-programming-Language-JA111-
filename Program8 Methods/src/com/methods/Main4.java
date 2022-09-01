package com.methods;

// fibonacci series [0,1,1,2,3,5,8,13,21,34,54,....]
// This means calculating previous 2 integer for next value, and it will till nth terms.
public class Main4 {

	static int fibo(int n) {
		/*
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		*/
		if(n==1 || n==2) {
			return n-1;
		}
		else {
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = fibo(7);
		System.out.println(result);
	}

}
