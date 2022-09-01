package com.hasA;

public class Engine {

	int rmp;
	int Power;
	String manufacturer;
	boolean hasTurbo;
	
	public boolean hasTurboEnability() {
		return hasTurbo = true;
	}
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	public Engine(int rmp, int power, String manufacturer) {
		super();
		this.rmp = rmp;
		Power = power;
		this.manufacturer = manufacturer;
	}
	
	
}
