package p.ArayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int count =1;
		
		while(true) {
			
			System.out.println("Enter Student deatils " + count++ +":");
			
			System.out.println("Enter Roll:");
			int roll = sc.nextInt();
			
			System.out.println("Enter Name:");
			String name = sc.next();
			
			System.out.println("Enter Marks:");
			int marks = sc.nextInt();
			
			Student student = new Student(roll, name, marks);
			
			students.add(student);
			
			
			System.out.println("You want to add more (yes/no):");
			String choice = sc.next();
			
			if(choice.equals("no")) {
				System.out.println("Showing all the "+ (count-1) +" Students details:\n"+"---------------------------------");
				break;
			}
			
		}
			
		
		int c = 1;
		for(int i=0; i<students.size(); i++) {
			System.out.println("Student " + c++ +":\n"+"-----------");
			
			System.out.println("Roll: "+students.get(i).getRoll());
			System.out.println("Name: "+students.get(i).getName());
			System.out.println("Marks: "+students.get(i).getMarks());
			
			System.out.println("======================\n");
		}
		
		

	}

}
