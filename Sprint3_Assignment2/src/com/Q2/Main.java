package com.Q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an array of Animal class with size 3
		
		Animal[] animal = new Animal[3];
		
		for(int i=0; i<animal.length; i++) {
			
			//initialise all 3 elements of this Animal class with
			//Dog, Cat and Tiger class object.
			animal[0] = new Dog();
			animal[1] = new Cat();
			animal[2] = new Tiger();
			
			//call the all methods (eat,walk,makeNoise) from all the 3 objects.	
			animal[i].eat();
			animal[i].walk();
			animal[i].makeNoise();
			System.out.println("==================");
			
		}
		

	}

}
