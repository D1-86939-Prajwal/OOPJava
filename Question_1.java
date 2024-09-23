import java.util.*;
public class Question_1{
    public static void main(String args[]){
        double avg;
        double num1 = 0;
        double num2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        if(!sc.hasNextDouble()){
        	System.out.println("The number entered is not a double Enter a double value");
        System.exit(0);
        }
        num1 = sc.nextDouble();
        System.out.println("Enter the second number :");
        
        if(!sc.hasNextDouble()){
        	System.out.println("The Second number is not a double Enter a double value");
        	System.exit(0);
        }
        num2 = sc.nextDouble();
        sc.close();
        
        System.out.println("The numbers entered are double :");
        avg = (num1+num2)/ 2;
        System.out.println("The average of the numbers "+ num1 +" "+ num2 + " is : " + avg);

    }
}
