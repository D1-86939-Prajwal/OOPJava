package Question1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Students[] s = new Students[5];
		s[0] = new Students(3,"Ram","Jalgaon",90);
		s[1] = new Students(2,"Sham","Shegaon",91);
		s[2] = new Students(4,"Suresh","Nanded",88);
		s[3] = new Students(5,"Mukesh","Kolhapur",87);
		s[4] = new Students(1,"Anil","Pune",92);
 
		
		int choice;
		
		do {
			System.out.println("1.Sort Students on city");
			System.out.println("2.Sort Students on Marks");
			System.out.println("3.Sort students on Name");
			System.out.println("0.Exit");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			
			switch(choice) {
			  
			case 1: 
				class StudentCityComparator implements Comparator<Students> {
					@Override
					public int compare(Students o1, Students o2) {
						return o1.getCity().compareTo(o2.getCity());
					}
				}
				
				StudentCityComparator stdCityComp = new StudentCityComparator();

 				Arrays.sort(s, stdCityComp);

				System.out.println("Students List After Sorting City Wise ->");
				for (Students student : s)
					System.out.println(student);
				
				break;
				
			case 2: 
				class StdMarksComparator implements Comparator<Students> {
					
				
					@Override
					public int compare(Students o1, Students o2) {
						int diff = Double.compare(o1.getMarks(), o2.getMarks());
						if (diff == 0)
							diff = o1.getName().compareTo(o2.getName());
						return -diff;
					}
				}
				
				StdMarksComparator stdMarksComp = new StdMarksComparator();

 				Arrays.sort(s, stdMarksComp);

				System.out.println("Students List After Sorting Marks Wise ->");
				for (Students student : s)
					System.out.println(student);
			    
			    break;
			
			case 3:
				class StdNameComparator implements Comparator<Students> {
					@Override
					public int compare(Students o1, Students o2) {
						return o1.getName().compareTo(o2.getName()); 
					}
				}
				
				StdNameComparator stdNameComp = new StdNameComparator();

 				Arrays.sort(s, stdNameComp);

				System.out.println("Students List After Sorting Name Wise ->");
				for (Students student : s)
					System.out.println(student);
			    
			    break;
			    
            case 0: break;
			
			default: System.out.println("Enter Valid Choice ");   
				
				
			}
			
			 
		}while(choice!=0);
		
     }
}
		
 
