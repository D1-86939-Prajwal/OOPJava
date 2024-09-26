package tester;
import java.util.*;
import com.app.geometry.*;

public class TestPointArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points to plot:");
        Point2D[] points = new Point2D[sc.nextInt()];

        for (int r = 0; r < points.length; r++) {
            System.out.println("Enter the X Coordinate for point " + (r + 1) + ":");
            int x = sc.nextInt();
            System.out.println("Enter the Y Coordinate for point " + (r + 1) + ":");
            int y = sc.nextInt();
            points[r] = new Point2D(x, y);
        }

        System.out.println("Points entered:");
        for (Point2D point : points) {
            System.out.println(point.getDetails());
        }
        

        
        int choice = 0;
        do {
        	System.out.println("1 Display the detials of a specific point");
        	System.out.println("2 Display x , y co-ordinates of all points");
        	System.out.println("3 Validate the indices");
        	System.out.println("4 Exit the menu");
        	System.out.println("Enter the choice : ");
        	choice = sc.nextInt();
        	
        	
        	switch (choice) {
        	case 1 : 
        		System.out.println("Enter the index of the point");
        		System.out.println("The details of the point :"+ points[sc.nextInt()].getDetails());
        		break;
        	case 2 :
        		for (Point2D element:points) {
        			System.out.println(element.getDetails());
        		}
        		
        		break;
        	case 3:
        		System.out.println("Enter the first index:");
        		int index1; 
        		index1 = sc.nextInt();
        		System.out.println("Enter the second index:");
        		int index2;
        		index2 = sc.nextInt();
        		
        		if((index1 < points.length && index1 >= 0 )&&(index1 < points.length && index1 >= 0)) {
        			if(! points[index1].isEqual(points[index2])){
        				System.out.println("Distance Between two points :" + points[index1].calculateDistance(points[index2]));
        		
        			}   		
        		  }
        	
        		break;
        		
        		
        	case 4:
        		System.out.println("Exiting ..");
        		break;
        	}
        	
        	
        	
        } while(choice != 4);
          sc.close();
   
    }
    
    
}
