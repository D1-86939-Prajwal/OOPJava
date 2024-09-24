import java.util.*;
public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 ;
		System.out.print("Enter the number : ");
		
		if(sc.hasNextInt()){
			num1 = sc.nextInt();
			Integer i = new Integer(num1);
		System.out.println("Integer to Binary "+ num1+ " "+ i.toBinaryString(num1));
		System.out.println("Integer to Ocatal " +num1+ " "+i.toOctalString(num1));
		System.out.println("Interger to Hex " +num1+ " "+ i.toHexString(num1));
		}
		else {System.out.println("Invalid input Enter a Integer : ");}

	}

}
