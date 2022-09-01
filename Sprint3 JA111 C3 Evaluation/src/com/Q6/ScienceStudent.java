package com.Q6;

public class ScienceStudent implements Student{

	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	private int biologyMarks;
	
	
	public final int getPhysicsMarks() {
		return physicsMarks;
	}
	public final void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public final int getChemistryMarks() {
		return chemistryMarks;
	}
	public final void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public final int getMathsMarks() {
		return mathsMarks;
	}
	public final void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public final int getBiologyMarks() {
		return biologyMarks;
	}
	public final void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}
	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
