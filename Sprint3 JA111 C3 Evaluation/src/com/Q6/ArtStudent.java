package com.Q6;

public class ArtStudent implements Student {

	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	
	public final int getHindiMarks() {
		return hindiMarks;
	}
	public final void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	public final int getEnglishMarks() {
		return englishMarks;
	}
	public final void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	public final int getHistoryMarks() {
		return historyMarks;
	}
	public final void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	@Override
	public double findPercentage() {

		int sum = getHindiMarks() + getEnglishMarks() + getHistoryMarks();
		int per = (sum*100)/300;
		return per;
		
	}

	
	
}
