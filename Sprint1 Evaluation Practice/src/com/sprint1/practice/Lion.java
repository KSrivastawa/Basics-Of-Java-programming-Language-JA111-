package com.sprint1.practice;

public class Lion {

	// assigned variables
		String name;
		boolean isHungry;
		int age;	
	
		// assigned static variables so that we can use through printKillings method in the main method
	static int totalDeaths;
	
	// here assigned by static so that we can call directly in main method
	static void printKillings() {
		System.out.println("Total killings by lions in jungle = "+totalDeaths);
	}
	
	// this is not a static method that's why, using object creation to get the required result
	void thinking() {
		// ● if isHungry=false then print LionName is sleeping;
		if(isHungry == false) {
			System.out.println(name +" is sleeping");
		}
			
		
		// ● if isHungry=true and age>12 then increase the totalDeaths by two and print lionName has eaten two
		// animal
		 if(isHungry==true && age>12) {
				totalDeaths = totalDeaths+2;
				System.out.println(name +" has eaten two animal");
		 }

		
		// ● if isHungry=true and age<=12 and age >=2 then increase the totalDeaths by one and print lionName
		// has eaten one animal
			 if(isHungry==true && age<=12 && age >=2) {
					totalDeaths++;
					System.out.println(name +" has eaten one animal");
			 }

		
		// ● if isHungry=true and age<=2 then print lionName is calling Mom
				 if(isHungry==true && age<=2) {
						System.out.println(name + " is calling Mom");
				 }
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// created 3 objects here
		Lion obj1 = new Lion();
		Lion obj2 = new Lion();
		Lion obj3 = new Lion();
		
		// assigned values to the variables for each object 
		obj1.name = "Lion1";
		obj1.isHungry = true;
		obj1.age = 23;
		
		obj2.name = "Lion2";
		obj2.isHungry = true;
		obj2.age = 1;
		
		obj3.name = "Lion3";
		obj3.isHungry = true;
		obj3.age = 5;
		
		// calling each objects for applied condition should get execute
		obj1.thinking();
		obj2.thinking();
		obj3.thinking();
		
		// calling this method to find total killings
		printKillings();
	}

}


// result 
/*
 	Lion1 has eaten two animal
	Lion2 is calling Mom
	Lion3 has eaten one animal
	Total killings by lions in jungle = 3
*/



