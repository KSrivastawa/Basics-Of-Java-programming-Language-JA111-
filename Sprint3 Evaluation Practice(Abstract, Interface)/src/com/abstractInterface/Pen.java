package com.abstractInterface;

public abstract class Pen {

	abstract void write();
	abstract void refill();
	
}

class FountainPen extends Pen {
	
	void changeNib(){
		System.out.println("Changing nib...");
	}

	@Override
	void write() {
		System.out.println("write");
		
	}

	@Override
	void refill() {
		System.out.println("refill");
		
	}
}

class Monkey {

	void jump() {
		System.out.println("jump");
	}
	
	void bite() {
		System.out.println("bite");
	}
}

interface BasicAnimal {
	
	void eat();
	void sleep();
}

class Human extends Monkey implements BasicAnimal {
	
	void human() {
		System.out.println("Hello Human");
	}

	@Override
	public void eat() {
		System.out.println("Eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping...");
		
	}
}









