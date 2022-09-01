package com.example1;

public interface Print {

	int num = 10;
	void printing();
	
}

class A implements Print {

	@Override
	public void printing() {
		System.out.println("Hello A");
		int square = num*num;
		System.out.println(square);
	}
	
}

class B implements Print {

	@Override
	public void printing() {
		System.out.println("Hello B");
		
	}
	
}

class PrintDetails {
	
	public static void accessDetails(Print p) {
		
		p.printing();
		
	}
}
