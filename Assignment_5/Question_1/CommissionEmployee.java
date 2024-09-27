package Question_1;

import java.util.*;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	public CommissionEmployee() {
		super();
	}

	public CommissionEmployee(double grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the GrossSales : ");
		grossSales = sc.nextDouble();
		System.out.println("Enter the Commission Rate :");
		commissionRate = sc.nextDouble();

	}

	public void display() {
		super.display();
		System.out.println("Wage : " + grossSales);
		System.out.println("Hours : " + commissionRate);
		System.out.println("Monthly Salary : " + grossSales * commissionRate);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
