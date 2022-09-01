package com.problem2;

public class Main {

	static int a = 200;
	static A obj = new A();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj1 = new Main();
		
		  System.out.println(obj1.a);  // 200
		  System.out.println(obj1.obj); // com.problem2.A@5e265ba4
		
		obj.funA(); 	// The square of 10 is: 100
		
		System.out.println(Main.obj);  // com.problem2.A@5e265ba4
		
		Main.obj.funA();  // The square of 10 is: 100
		// --- line 16 and 20 gives same result in such cases.
		
		
	}

	

}
