package com.Q;

public class Department {

	private int departmentId;
	private String departmentName;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	

	public final int getDepartmentId() {
		return departmentId;
	}

	public final void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public final String getDepartmentName() {
		return departmentName;
	}

	public final void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}
