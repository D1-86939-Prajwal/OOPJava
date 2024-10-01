package Question_2;
import java.util.*;
public class Circle {
	private Point2D centerPoint = new Point2D(0,0);
	private double diameter = 100;

	public Circle() {
		super();
	}



	public Circle(Point2D centerPoint, double diameter) {
		super();
		this.centerPoint = centerPoint;
		this.diameter = diameter;
	}

	public void setCenterPoint(Point2D centerPoint) {
		this.centerPoint = centerPoint;
	}
	
	
	public void setDiameter(double diameter) throws negativeDiameterException {
		if(diameter < 0 ) {
			throw new negativeDiameterException("The Diameter entered is negative ");
		}
		this.diameter = diameter;
	}

		public void accept(Scanner sc) throws negativeDiameterException {
			
			System.out.println("Enter the X Co-ordinate");
			centerPoint.x = sc.nextDouble();
			System.out.println("Enter the y Co-Ordinate ");
			centerPoint.y = sc.nextDouble();
			System.out.println("Enter the diameter of the circle :");
			diameter = sc.nextDouble();
			if(diameter < 0) {
				throw  new negativeDiameterException("The diameter entered was negative ");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
