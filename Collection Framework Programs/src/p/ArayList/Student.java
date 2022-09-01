package p.ArayList;

public class Student {
// Java Bean class
	
	private int roll;
	private String name;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	
	public final int getRoll() {
		return roll;
	}

	public final void setRoll(int roll) {
		this.roll = roll;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getMarks() {
		return marks;
	}

	public final void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
}
