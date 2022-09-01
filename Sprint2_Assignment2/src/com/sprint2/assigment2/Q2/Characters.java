package com.sprint2.assigment2.Q2;

public class Characters {
	
	public char checkCharacter(char ab) {
		
		if(ab>='A' && ab<='Z') {
			return(Character.toLowerCase(ab));
		}
		else {
			return ab;
		}
		
	}

}
