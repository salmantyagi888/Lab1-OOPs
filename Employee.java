package com.email.model;

public class Employee {
	
	private String firstName;
	private String lastname;
	
     public Employee (String firstname, String lastname) {
    	 this.firstName= firstname;
    	 this.lastname= lastname;
     }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
     
     
}
