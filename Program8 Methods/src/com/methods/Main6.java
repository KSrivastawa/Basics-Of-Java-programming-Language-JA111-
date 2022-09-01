package com.methods;

public class Main6 {
	
	 static void patternByRecusive(int n) {
			if(n>0) {
				 patternByRecusive(n-1);
				 
				for(int i=0; i<n; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		 
	 }
	 
	 static void patternReverseByRecusive(int n) {
			if(n>0) {
				 
				for(int i=n; i>0; i--) {
					System.out.print("*-");
				}
				System.out.println();
				patternReverseByRecusive(n-1);  // for the reverse
			}
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		patternByRecusive(5);
		
		patternReverseByRecusive(4);
		
	}

}
