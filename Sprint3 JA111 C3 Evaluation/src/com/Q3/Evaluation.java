package com.Q3;

public abstract class Evaluation {

	private final int numberOfQuestions = 5;
	
	abstract void evaluationTiming();
	
	

	public final int getNumberOfQuestions() {
		return numberOfQuestions;
	}



	void printNoOfQuestions() {
		
		System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}
	
	
}
