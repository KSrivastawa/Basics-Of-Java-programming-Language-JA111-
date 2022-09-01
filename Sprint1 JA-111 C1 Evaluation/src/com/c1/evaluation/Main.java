package com.c1.evaluation;

public class Main {

	static void printMonths(String month) {
		
		// assigning conditional values by switch method;
		
		switch(month) {
		
		case "JAN"-> System.out.println("This is the 1st Month of the Year January");
		case "FEB"-> System.out.println("This is the 2nd Month of the Year February");
		case "MAR"-> System.out.println("This is the 3rd Month of the Year March");
		case "APR"-> System.out.println("This is the 4th Month of the Year April");
		case "MAY"-> System.out.println("This is the 5th Month of the Year May");
		case "JUN"-> System.out.println("This is the 6th Month of the Year June");
		case "JUL"-> System.out.println("This is the 7th Month of the Year July");
		case "AUG"-> System.out.println("This is the 8th Month of the Year August");
		case "SEP"-> System.out.println("This is the 9th Month of the Year September");
		case "OCT"-> System.out.println("This is the 10th Month of the Year October");
		case "NOV"-> System.out.println("This is the 11th Month of the Year November");
		case "DEC"-> System.out.println("This is the 12th Month of the Year December");
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling method
		String a ="DEC";
		printMonths(a);  // always mentioned in put inside double quote ""(as in String form).
	}

}
