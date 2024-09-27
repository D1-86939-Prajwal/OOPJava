package Question_1;

import java.util.*;

public class Employee {

	private String firstname;
	private String lastname;
	private String SSN;

	public Employee() {
		super();
	}

	public Employee(String firstname, String lastname, String sSN) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		SSN = sSN;
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

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		firstname = sc.next();
		System.out.println("Enter the last name : ");
		lastname = sc.next();
		System.out.println("Enter the Social Security Number :");
		SSN = sc.next();
	}

	public void display() {
		System.out.println("First Name : " + firstname);
		System.out.println("Last Name : " + lastname);
		System.out.println("Social Security Number : " + SSN);
	}

	public static void main(String[] args) {

	}
}
