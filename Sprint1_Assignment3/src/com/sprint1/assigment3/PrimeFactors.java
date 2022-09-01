package com.sprint1.assigment3;
/*
 Q2) The prime factors of a number are all of the integers below that number that are
	divisible into the number as well as 1. For example, the prime factors of 12 are 1,2,3,4,6,
	and 12.
	
	● Write a Java class with a static method that will take a number and print all the prime factorial
	of that number.
	● The Supplied number should be between 2 and 100. otherwise, it should print “Invalid
	number”.
	● Call this method from the main method by supplying any valid argument.

 */
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 12;
		
		if(number>=2 && number<=100) {
			for(int i=1; i<=number; i++) {
				if (number % i == 0) 
					System.out.println(i);

			}
		}
		else {
			
			System.out.println("Invalid number");
		}
		
		
	}

}
