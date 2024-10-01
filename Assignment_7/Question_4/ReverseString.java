package Question_3;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseString(String string) {
		
		String res = "";
		
		for(int i=string.length() - 1; i>=0; i--) {
			res = res + string.charAt(i);
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the String Input: ");
		String initialString = scn.next();
		
		System.out.println("Initial String= " + initialString);
		
		String finalString = reverseString(initialString);
		
		System.out.println("Final String= " + finalString);
		

	}

}
