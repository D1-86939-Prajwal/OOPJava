package Question_1;

public class Tester {
	public static void CheckStringLength(String nextLine) throws ExceptionLineTooLong {
		// TODO Auto-generated method stub
		if(nextLine.length() > 10) {
			throw new ExceptionLineTooLong("The string entered is more than 80 characters");
		
	}
	}
}
