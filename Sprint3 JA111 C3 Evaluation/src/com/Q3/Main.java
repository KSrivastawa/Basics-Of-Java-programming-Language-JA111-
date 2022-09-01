package com.Q3;

public class Main {
	
	public void messageToStudents(Evaluation evaluation) {
		
		if(evaluation instanceof DsaEvaluation) {
			System.out.println("Its a DSA Evaluation");
			evaluation.printNoOfQuestions();
			evaluation.evaluationTiming();	
			System.out.println("===========================================\n");
		}
		else if(evaluation instanceof CodingEvaluation) {
			System.out.println("Its a Coding Evaluation");
			evaluation.printNoOfQuestions();
			evaluation.evaluationTiming();
			System.out.println("===========================================\n");
		}
		
	};
	
	
	public static void main(String[] args) {
		
		Main m1 = new Main();
		
		m1.messageToStudents(new DsaEvaluation());
		m1.messageToStudents(new CodingEvaluation());
		
	}


}
