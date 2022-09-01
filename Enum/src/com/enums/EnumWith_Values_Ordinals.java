package com.enums;

import java.util.Arrays;

public class EnumWith_Values_Ordinals {

	public static void main(String[] args) {
		
		Month[] month = Month.values();
		
		for(int i=0; i<month.length; i++) {
			
			System.out.println(month[i]+" ---> "+(1+month[i].ordinal()));

		}
		
		Month[] m = Month.values();
		
		 System.out.println(Arrays.toString(m));  // [JAN, FEB, MAR, APR, MAY]

		 System.out.println(m.length);
		
	}
	
}


