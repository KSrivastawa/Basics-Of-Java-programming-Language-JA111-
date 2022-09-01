package com.sprint2.assignment3.Q2;

public class Demo {

		Demo(){
			 this("Welcome");
			System.out.println("This is the Demo()");
		};
		
		Demo(String s){
			 this(85);
			System.out.println("This is the Demo(String s): "+s);
		};
		
		Demo(int i){
			 this(20.5f);
			System.out.println("This is the Demo(int i): "+i);
		};
		
		Demo(float f){
			System.out.println("This is the Demo(float f): "+f);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo object = new Demo();
		
	}

}
