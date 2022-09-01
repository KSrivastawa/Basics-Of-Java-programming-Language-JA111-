package com.multiple_Inheritence;

public interface Animal {

	void makeNoise();
}

class Dog implements Animal {

	@Override
	public void makeNoise() {
		System.out.println("Dog Bark....");		
	}
	
}

class Cat implements Animal {

	@Override
	public void makeNoise() {
		System.out.println("Cat Meow....");		
	}
	
}

