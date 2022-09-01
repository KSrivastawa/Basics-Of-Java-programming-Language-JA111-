package com.itrator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a","b","c","d","e");
		
		Iterator<String> itr = list.iterator();

		while(itr.hasNext()) {
			
			String s = itr.next();
			if(s.equals("c")) {
				itr.remove();
				
			}
			
			System.out.println(s);
			
		}
		
	}

}
