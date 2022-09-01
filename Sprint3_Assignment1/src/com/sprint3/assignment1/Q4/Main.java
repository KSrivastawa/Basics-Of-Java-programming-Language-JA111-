package com.sprint3.assignment1.Q4;

public class Main {
	
	void factorial(String[] args) {
		
		int[] arr = new int[args.length];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
			//System.out.println(arr[i]);
		}
		
		
		if(arr.length == 1) {
			int factMulti = 1;
			
			for(int i=1; i<=arr[0]; i++) {
				factMulti = factMulti* i;
			}
			System.out.println(factMulti);
		}
		else if(arr.length==2) {
			arr[0]= Math.abs(arr[0]-arr[1]);
			
				int factMulti = 1;
			
			for(int i=1; i<=arr[0]; i++) {
				factMulti = factMulti* i;
			}
			System.out.println(factMulti);
		}
		else {
			System.out.println("Error");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj = new Main();
		obj.factorial(args);
	}

}
