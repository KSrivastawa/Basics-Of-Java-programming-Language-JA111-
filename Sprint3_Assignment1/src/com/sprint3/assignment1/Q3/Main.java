package com.sprint3.assignment1.Q3;

public class Main {

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		
		
		if(inputArray!= null) {
			
				for(int j=0; j<inputArray.length; j++) {
					int count = 0;
		
					for(int i=1; i<=inputArray[j]; i++) {
					if(inputArray[j]%i==0) {
						count++;
					}
				}
				
				if(count==2) {
				
				 System.out.println(inputArray[j]);
					
				}
				
			}

		}
		
		
		return inputArray;
		
	}
	public static void main(String[] args){
		
		int[] arr = {10,12,5,50,11,14,15};
		Main obj = new Main();
		
		int[] newArr =  obj.findAndReturnPrimeNumbers(arr);

		if(newArr != null) {
			for(int i=0; i<newArr.length; i++) {
				System.out.print(newArr[i]+" ");
			}
		}
		else {
			System.out.println("Prime number not found in the supplied Array");
		}

	

	}
}
