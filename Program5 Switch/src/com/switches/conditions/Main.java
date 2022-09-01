package com.switches.conditions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--for string by traditional method--");
		// for string by traditional method
		String name = "bit";
		
		switch(name) {
		
		case "Ketan": System.out.println("Handsome boy1!");
			break;
		case "Nishant": System.out.println("Handsome boy2!");
			break;
		case "Aman": System.out.println("Handsome boy3!");
			break;
		case "Vaibhav": System.out.println("Handsome boy4!");
			break;
		case "Ravi": System.out.println("Handsome boy5!");
			break;
		default: System.out.println("Sorry please make-up yourself!");
			break;
		}
		
		
		System.out.println("\n--for string by enhanced switch method--");
		// for string by enhanced switch method
		String sentence = "kit";
		
		switch(sentence) {
		
		case "Ketan" ->{
			System.out.println("Handsome boy1!");
			System.out.println("Great boy1!");
			System.out.println("Skilled boy1!");
		}
			
		case "Nishant"-> System.out.println("Handsome boy2!");
			
		case "Aman"-> System.out.println("Handsome boy3!");
			
		case "Vaibhav"-> System.out.println("Handsome boy4!");
			
		case "Ravi"-> System.out.println("Handsome boy5!");
		
		default->System.out.println("Sorry please make-up yourself!");
			
		}
		
		
		System.out.println("\n--for integer by enhanced switch method--");
		// for integer by enhanced switch method
				int number = 46;
				
				switch(number) {
				
				case 18 ->{
					System.out.println("Super!");
					System.out.println("Great!");
					System.out.println("Skillfull!");
				}
					
				case 26-> System.out.println("super!");
					
				case 46-> System.out.println("great!");
					
				case 13-> System.out.println("skillfull!");
					
				case 85-> System.out.println("adult!");
				
					
			}
				
				
			System.out.println("\n--Day of the week--");	
		// find the day for given number
				int numberOfDay = 2;
				
				switch(numberOfDay) {
				case 1 -> System.out.println("Monday");
				case 2 -> System.out.println("Tuesday");
				case 3 -> System.out.println("Wednesday");
				case 4 -> System.out.println("Thursday");
				case 5 -> System.out.println("Friday");
				case 6 -> System.out.println("Satuarday");
				case 7 -> System.out.println("Sunday");
				}
		
	}

}
