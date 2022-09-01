package com.Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		input = sc.nextInt();
		
		Test t1 = new Test();
		
		int[] arr = t1.display(input);
		

		if(arr != null) {
		for(int i=0;i<arr.length; i++) {

			if(arr[i]!= 0) {
				System.out.print(arr[i]+" ");
				
			}
		}
	  }
		else {
			System.out.println("Enter the number greaterthan 1.");
		}
	
		
	}

}
