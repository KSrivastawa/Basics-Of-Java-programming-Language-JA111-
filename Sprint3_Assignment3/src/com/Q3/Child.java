package com.Q3;

import java.util.Scanner;

public final class Child extends Parent {

	int num;
	
	@Override
	public void method1(){
		
		System.out.println("this is method1 of Child");
		
		if(number == num) {
			System.out.println(number);
		}
		
		else {
			System.out.println("Invalid Number");
		}
	}
	
	public void method2C(){
			
			System.out.println("this is method2 of Child");
		}
	
	@Override
	public void method3(){
		
		System.out.println("this is method3 of Child");
	}
	
	public void method4(){
		
		System.out.println("this is method4 of Child");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number between 1-10:");
		
		n = sc.nextInt();
		
		Child child = new Child();
		child.num = n;
		
		child.method1();
		child.method2();
		child.method2C();
		child.method3();
		child.method4();
		
		
	}

}
