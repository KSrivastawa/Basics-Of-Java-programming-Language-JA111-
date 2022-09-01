package com.abstractInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Demonstrate Polymorphism
		
		Pen p1 = new FountainPen();
		p1.refill();
		p1.write();
		
		FountainPen f1 = (FountainPen)p1;
		f1.changeNib();
		//------------------------------------//
		
		BasicAnimal b1 = new Human();
		b1.eat();
		b1.sleep();
		
		Human h1 = (Human)b1;
		h1.bite();
		h1.jump();
		h1.human();
		
		// -------------------------------//
		
		TelePhone t1 = new SmartTelephone();
		t1.ring();
		t1.lift();
		t1.disconnect();
		
		SmartTelephone s1 = (SmartTelephone)t1;
		s1.moto();
		
		//------------------------------------//
		
		TvRemote tv1 = new TV();
		tv1.normal();
		tv1.smart();
		
		TV tv2 = (TV)tv1;
		tv2.classTv();
		
		
	}

}
