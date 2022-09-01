package com.sprint1.assignment2;
/*
Q2) Create a class Main with a main method.
	This main method has one local variable:
		city : String
		
		if city.equals("Mumbai") then print
		"Financial city"
		if city.equals("Kolkata") then print
		"City of Joy"
		if city.equals("Delhi") then print
		"Capital of the country"
		if city.equals("Bangalore") then print
		"Cyber City"
		otherwise
		"May be Other Indian City"
	
	● You should implement this using switch-case
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String city = "Kolkatar";
		
		switch(city) {
		case "Mumbai": System.out.println("Financial city");
		break;
		case "Kolkata": System.out.println("City of Joy");
		break;
		case "Delhi": System.out.println("Capital of the country");
		break;
		case "Bangalore": System.out.println("Cyber City");
		break;
		default : System.out.println("May be Other Indian City");
		break;
	  }
		
	}

}
