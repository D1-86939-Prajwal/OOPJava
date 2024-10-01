package Question_2;
import java.util.*;
public class TestCircle {
		
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Point2D point =  new Point2D();
		Scanner sc = new Scanner(System.in);
		try {
			circle.setCenterPoint(new Point2D(21,30));
			circle.setDiameter(100);
			System.out.println("Circle :"+ point.toString());
			circle.accept(sc);
			System.out.println("Circle :" +point.toString());
		}
		catch(negativeDiameterException e ) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	
		System.out.println("The program executed successfully ");
	}
}
