package com.Question_2;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("John","Wick",10000);
		Employee e2 = new Employee("James","Bond",30000);
		
		System.out.println("Salary before hike :" + e1.beforesalary()); ;
		System.out.println("Salary before hike :" + e2.beforesalary());
		System.out.println("Salary before hike :" + e1.aftersalary());
		System.out.println("Salary before hike :" + e2.aftersalary());
	}
}

