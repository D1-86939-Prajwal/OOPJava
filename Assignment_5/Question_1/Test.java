package Question_1;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		System.out.println("1 Salaried Employees Detials");
		System.out.println("2 Hourly Employees Detials");
		System.out.println("3 Commission Employees Detials");
		System.out.println("4 Base-Salaried Employees Detials");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		if(choice == 1) {
			Employee e = new Employee();
			e.accept();
			e.display();
		}
		else if(choice == 2) {
			Employee e = new SalariedEmployee();
			e.accept();
			e.display();
		}
		else if(choice ==3) {
			Employee e = new HourlyEmployee();
			e.accept();
			e.display();
		}
		else if(choice ==4) {
			Employee e = new CommissionEmployee();
			e.accept();
			e.display();
		}
		else if(choice ==4) {
			Employee e = new BaseSalariedCommissionEmployee();
			e.accept();
			e.display();
		}
		else {
			System.out.println("Invalid input");
		}
		
		
		
		
		
		
		
		

	}

}
