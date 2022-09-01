package com.sprint3.assignment1.Q1;

import java.util.Scanner;

public class Main {


	public static String reversString(String input){
		
			char[] x = input.toCharArray();
			
		
		if(x !=null) {
		
			String bag = "";
			for(int i=x.length-1; i>=0; i--) {
					bag+=x[i];
			}
			return bag;
		}
		
		return "Sorry!";
		
		}
	
		public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		
		String result = reversString(originalString);
		
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		
		}


}
