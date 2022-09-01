package com.Q1;

public class Main {

	public static Person generatePerson(Person person) {
		//If person is a type of student
		if(person instanceof Student) {
			
//			Address a=new Address();
//			person.address=a;
			person.address.city = "Siwan";
			person.address.state = "Bihar";
			person.address.pinCode = "841226";
			person.name = "Ketan";
			person.gender = "Male";
			  Student s1 =(Student)person;
			  s1.studentId = 564;
			  s1.courseEnrolled = "Java";
			  s1.courseFee = 40000;
			  
			return person;
		}
		//If person is a type of instructor
		else if(person instanceof Instructor) {
			
			person.address.city = "Patna";
			person.address.state = "Bihar";
			person.address.pinCode = "811001";
			person.name = "Prashant";
			person.gender = "Male";
			 Instructor ins = (Instructor)person;
			 ins.instructorId = 162;
			 ins.salary = 35000;
			 
			 return person;
		}
		//
		else {
			return null;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person student = generatePerson(new Student());
		
		Person instructor = generatePerson(new Instructor());
		
		//Object p=generatePerson(null);

		System.out.println(student);
		System.out.println(instructor);

	}

}




