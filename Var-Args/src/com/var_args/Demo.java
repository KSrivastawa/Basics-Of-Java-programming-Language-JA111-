package com.var_args;

public class Demo {

public static void fun1(Student... students) {
		
		
	for(Student s:students) {
			
		System.out.println(s);
			
	}
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Student[] stduetns= {
				
				new Student(10, "n1", 780),
				new Student(12, "n2", 780),
				new Student(13, "n3", 780),
				new Student(14, "n4", 780),
				
				
				
		};
		
		
		fun1(stduetns);
		
			
	}

}
