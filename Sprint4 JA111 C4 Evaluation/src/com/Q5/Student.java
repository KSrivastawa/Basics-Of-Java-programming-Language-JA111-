package com.Q5;

import java.util.LinkedHashSet;

public class Student {

	public static void countWords(String st) {
		
		char[] ch = st.toCharArray();
		
		LinkedHashSet<Character> chr = new LinkedHashSet<>();
		
		for(char cr : ch) {
			
			chr.add(cr);
		}
		
		
		
	}
	
	public static void main(String[] args) {

		
		String stri = "Hello Everybody, welcome to collection in JAVA.";
		
		Student.countWords(stri);
		
	}
	
}
