package com.var_args;

public class Two_TypesOf_Arguments {

	public static Object add(String name, int... arr) {
		
		int result=0;
		
		for(int i:arr) {
			
			result+=i;
			
		}
		
		return name+"-> "+result;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(add("Hello"));
		System.out.println(add("Hello",10));
		System.out.println(add("Hello",20,30));
		// System.out.println(add("Hello",null)); // gives null pointer exception
		
	}

}
