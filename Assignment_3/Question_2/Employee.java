package com.Question_2;

public class Employee {
	private String firstname;
	private String lastname ;
	private double salary;
	

	public Employee() {
		firstname = "Ethan";
		lastname = "Hunt";
		salary = 20000;
	}




	public Employee(String firstname, String lastname, double salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		if(salary > 0) {
		this.salary = salary;
		}
	}

	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	public double beforesalary() {
		return (this.salary * 12) ;
	}
	
	public double aftersalary() {
		return ((this.salary * 12) + (this.salary *12 * 0.1));
	}
	
}

