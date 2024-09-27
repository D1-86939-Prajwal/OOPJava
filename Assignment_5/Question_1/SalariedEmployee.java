package Question_1;

import java.util.*;

public class SalariedEmployee extends Employee {
	private double weeklySalary = 10000;

	public SalariedEmployee() {

	}

	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);

	}

	public void display() {
		super.display();
		System.out.println("Weekly Salary : " + weeklySalary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
