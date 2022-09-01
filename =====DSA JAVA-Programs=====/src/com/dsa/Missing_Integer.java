package com.dsa;

import java.util.Scanner;

public class Missing_Integer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
		
		}
		
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			
			sum+=(arr[i]);
		}
		
		//System.out.println(sum);
		
		int sum2 = 0;
		for(int i=1; i<=arr.length+1; i++) {
			
			sum2+= i;
		}

		System.out.println(sum2-sum);
		
	
	
	
	}
		

}
