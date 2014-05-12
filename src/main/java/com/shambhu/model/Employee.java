package com.shambhu.model;


public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String phone;

	public int getEmployeeId() {
		System.out.println("Getting employee id method called");
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		System.out.println("Getting employee FirstName method called");
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
