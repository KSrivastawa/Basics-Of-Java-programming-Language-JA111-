package com.sprint2.assignment1;

public class Lion {

	 String name;
	 boolean isHungry;
	 int age;
	 static int totalDeaths;
	 
	 static void printKillings() {
		 System.out.println("Total killings by lions in jungle = "+ totalDeaths);
	 }
	 
	 void thinking() {
		 	
		 if(isHungry==false) {
			 System.out.println(name +" is sleeping");
		 }	
		 
		 else if(isHungry=true && age>12 ) {
			 totalDeaths = totalDeaths +2;
			 System.out.println(name +" has eaten two animal");
		 }
		 
		 else if(isHungry=true && age<=12 && age >=2) {
			 totalDeaths++;
			 System.out.println(name +" has eaten one animal");
		 }
		 
		 else if(isHungry=true && age<2) {
			 System.out.println(name+" is calling Mom");
		 }
	 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  Lion Make 3 objects(lion1, lion2, lion3) of class Lion
		
		Lion lion1 = new Lion();
		
		lion1.name = "Ketan1";
		lion1.isHungry = true;
		lion1.age = 15;
		
		lion1.thinking(); // calling non-static method
		
		Lion lion2 = new Lion();
		
		lion2.name = "Ketan2";
		lion2.isHungry = true;
		lion2.age = 7;
		
		lion2.thinking(); // calling non-static method
		
		Lion lion3 = new Lion();
		
		lion3.name = "Ketan3";
		lion3.isHungry = false;
		
		lion3.thinking(); // calling non-static method
		
		
		
		Lion.printKillings();  //calculate total deaths
		
	}

}


