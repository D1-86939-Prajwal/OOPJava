package Question_1;

import java.util.*;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hrs;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(double wage, double hrs) {
		super();
		this.wage = wage;
		this.hrs = hrs;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the wage : ");
		wage = sc.nextDouble();
		System.out.println("Enter the Hours :");
		hrs = sc.nextDouble();

	}

	public void display() {
		super.display();
		if (hrs > 40) {
			double excesshrs = 0;
			excesshrs = hrs - 40;
			System.out.println("Wage for ExcessHours worked : " + ((wage * 40) + (wage * 1.5 * excesshrs)));
			System.out.println("Hours : " + hrs);
			System.out.println("ExcessHours : " + excesshrs);
		} else {
			System.out.println("Wage : " + wage);
			System.out.println("Hours : " + hrs);
		}
	}

	public static void main(String[] args) {

	}
}
