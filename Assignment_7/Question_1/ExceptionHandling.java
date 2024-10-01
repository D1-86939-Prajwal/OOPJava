package Question_1;
import java.util.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		try {
			Tester.CheckStringLength(sc.nextLine());
			
		} catch (ExceptionLineTooLong e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	System.out.println("The program was executed Successfully");
	}
}