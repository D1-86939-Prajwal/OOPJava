package Question_4;

import java.util.Scanner;

public class PallindromeString {
	
	public static boolean isPallindrome(String string) {
		String res = "";
		string = string.toLowerCase();
		
		for(int i=string.length()-1; i>=0; i--) {
			res = res + string.charAt(i);
		}
		if(res.equals(string)) {
			return true;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the String Input: ");
		
		String initialString = scn.next();
		
		if(isPallindrome(initialString))
			System.out.println("The String \""+ initialString +"\" is Pallindrome");
		
		else
			System.out.println("The String \""+ initialString +"\" is not Pallindrome");

	}

}
