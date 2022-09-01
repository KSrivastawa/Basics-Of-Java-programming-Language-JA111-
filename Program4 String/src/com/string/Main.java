package com.string;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String name = "Ketan Srivastawa"
		String name = new String("Ketan Srivastawa"); // String is a class also
		
		System.out.println(name.toLowerCase());  // ketan srivastawa
		
		System.out.println(name.toUpperCase()); // KETAN SRIVASTAWA
		
		System.out.println(name.replace(" ","_")); // Ketan_Srivastawa
		
		
		String letter = "Dear <|name|>, Thanks a lot!";
		letter = letter.replace("<|name|>",name);
		System.out.println(letter); // Dear Ketan Srivastawa, Thanks a lot!
		
		
		String sentence = "Hello  bro,   How are  you   !";
		System.out.println(sentence.indexOf("  ")); // at index of 5(which is found first) space is available
		System.out.println(sentence.indexOf("   ")); // at index of 11(which is found first) space is available
		
		String mySentence = "Dear Ketan,\n\tYou are a nice person!\n Thanks!";
		System.out.println(mySentence);
		// result will be like this:
		/*
		 Dear Ketan,
					You are a nice person!
 		   Thanks!
		 */
		
	}

}
