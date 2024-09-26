package Question_2;
import Question_2.DrivingCost;
public class DrivingTest {
	 public static void main(String [] args) {
		 DrivingCost dc1 = new DrivingCost();
		 DrivingCost dc2 = new DrivingCost(100,100,50,20,50);
		 
		 dc1.acceptdetails();
		 dc1.displaydetails();
		 dc2.displaydetails();
	 }
}