package com.c1.evaluation;

// creating Main2 because in a single package we cannot create class with similar name.
public class Main2 {

	public static void runScored(int one, int two, int three, int four ,int six) {
		// write your logic here
		
// ● implement the static runScored method to compute the total run scored by that batsman.
		
		int sum = (one*1)+ (two*2) + (three*3) + (four*4) + (six*6);
		
		System.out.println("Run scored by the Batsman: "+sum);
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call runScored with valid parameters
		
  // Enter here 5 inputs(positive numbers) which will be representing positions - 
	// ones,twos,threes,fours,sixes accordingly in the same manner to get sum of all scored runs.
		
		runScored(4,5,0,6,8);
		
	}

}


