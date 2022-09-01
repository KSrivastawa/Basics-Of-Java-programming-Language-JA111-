package com.sprint1.assigment3;


/*
 Q1) The set of positive numbers starting from 1 is known as Natural Numbers. The sum of
	the first N natural numbers is given by the formula [N * (N + 1)] / 2 For example, given a
	number 5, the sum of the first 5 natural numbers will be[5 * (6)]/2 = 15
	
	● Write a Java class with a static method that will take a number as a parameter, and print the
	sum of the natural number from 1 to the number supplied as the method argument.
	● Call the above-defined method from the main method of that class by supplying any number
	as an argument and print the result.
 */

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int naturalNumber = 5;
		int sum = 0;
		
		for(int i=1; i<=naturalNumber; i++) {
			sum = sum + i;			
		}
		
		System.out.println(sum);
		
		
	// Solved by direct on the Formulae of Sum of first N natural numbers starting from 1.
		int N = naturalNumber;
		System.out.println((N * (N + 1))/2);
	}

}
