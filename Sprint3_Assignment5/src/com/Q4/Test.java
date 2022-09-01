package com.Q4;

public class Test implements Intr {

	
	@Override
	public int[] display(int p) {

		int[] arr = null;
		
		if(p>1) {
			
			arr = new int[p+1];
			
			for(int i=2; i<=p; i++) {
				
				int count = 0;
				for(int j=1; j<=i; j++) {
					
					if(i%j==0) {
						count++;
					}
				}
				
				if(count==2) {
			
					arr[i]=i;
				}
				
				
			}			
			
		}
		
		
		return arr;
	}

}
