package com.abstractInterface;

public interface TvRemote extends SmartTvRemote  {

	void normal();
}

interface SmartTvRemote{

	void smart();
}

class TV implements TvRemote {
	
	void classTv() {
		System.out.println("Hello class Tv");
	}

	@Override
	public void normal() {
		System.out.println("Hello normal Tv");
		
	}

	@Override
	public void smart() {
		System.out.println("Hello smart Tv");
		
	}
}
