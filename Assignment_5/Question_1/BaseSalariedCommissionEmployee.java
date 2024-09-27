package Question_1;

import java.util.*;

public class BaseSalariedCommissionEmployee extends CommissionEmployee {
	private double base_salary;

	public BaseSalariedCommissionEmployee() {
		super();
	}

	public BaseSalariedCommissionEmployee(double base_salary) {
		super();
		this.base_salary = base_salary;
	}

	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}

	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base_Salary");
		base_salary = sc.nextDouble();

	}

	public void display() {
		super.display();
		CommissionEmployee e1 = new BaseSalariedCommissionEmployee();
		;
		System.out.println("Total Salary : " + base_salary * super.getCommissionRate());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
