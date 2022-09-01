package com.abstractInterface;

public abstract class TelePhone {

	abstract void ring();
	abstract void lift();
	abstract void disconnect();
	
}

class SmartTelephone extends TelePhone {

	void moto() {
		System.out.println("Hello Moto!");
	}
	
	@Override
	void ring() {
		System.out.println("TelePhone is Ringing...");
		
	}

	@Override
	void lift() {
		System.out.println("TelePhone is lifting...");
		
	}

	@Override
	void disconnect() {
		System.out.println("TelePhone is disconneted.");
		
	}
	
}





