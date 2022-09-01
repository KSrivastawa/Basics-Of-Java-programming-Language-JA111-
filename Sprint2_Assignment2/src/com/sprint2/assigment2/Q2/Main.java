package com.sprint2.assigment2.Q2;

public class Main {

	public void check(char abc) {
		
		if(abc == 'a'||abc == 'e'||abc == 'i'||abc == 'o'||abc == 'u') {
			
			System.out.println("Vowel");
		}
		
		else if(abc>='a' && abc<='z' && abc!= 'a'&&abc != 'e'&&abc != 'i'&&abc != 'o'&&abc != 'u') {
			
			System.out.println("Consonant");
		}
		
		else {
			
			System.out.println("Invalid");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Characters letter = new Characters();
		
		char xyz1 = letter.checkCharacter('e');
		char xyz2 = letter.checkCharacter('K');
		char xyz3 = letter.checkCharacter('9');
		
		Main obj = new Main();
		
		obj.check(xyz1);
		obj.check(xyz2);
		obj.check(xyz3);
		
		
	}


}
