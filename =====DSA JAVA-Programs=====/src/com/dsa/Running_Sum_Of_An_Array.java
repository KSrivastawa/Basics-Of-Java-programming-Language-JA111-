package com.dsa;

import java.util.Scanner;

public class Running_Sum_Of_An_Array {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter the "+ size+" elements which are <= "+size+":");
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		
		System.out.print("List of Elements are: ");
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		
		System.out.print("Results: ");
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			sum+=(arr[i]);
			System.out.print(sum+" ");
		}

	}

}
