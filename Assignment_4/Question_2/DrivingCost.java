package Question_2;

import java.util.Scanner;

public class DrivingCost {
	
	private int totalMiles;
	private int costOfGasoline;
	private int avgMilesGallon;
	private int parkingFees;
	private int tolls;

	
	public DrivingCost() {
	}
	
	public DrivingCost(int totalMiles, int costOfGasoline, int avgMilesGallon, int parkingFees, int tolls) {
		this.totalMiles = totalMiles;
		this.costOfGasoline = costOfGasoline;
		this.avgMilesGallon = avgMilesGallon;
		this.parkingFees = parkingFees;
		this.tolls = tolls;
	}


	public int getTotalMiles() {
		return totalMiles;
	}

	public void setTotalMiles(int totalMiles) {
		this.totalMiles = totalMiles;
	}

	public int getCostOfGasoline() {
		return costOfGasoline;
	}

	public void setCostOfGasoline(int costOfGasoline) {
		this.costOfGasoline = costOfGasoline;
	}

	public int getAvgMilesGallon() {
		return avgMilesGallon;
	}

	public void setAvgMilesGallon(int avgMilesGallon) {
		this.avgMilesGallon = avgMilesGallon;
	}

	public int getParkingFees() {
		return parkingFees;
	}

	public void setParkingFees(int parkingFees) {
		this.parkingFees = parkingFees;
	}

	public int getTolls() {
		return tolls;
	}

	public void setTolls(int tolls) {
		this.tolls = tolls;
	}

	Scanner sc = new Scanner(System.in);
	
	public void acceptdetails() {
	System.out.println("Enter the total miles : ");
	totalMiles = sc.nextInt();
	System.out.println("Enter the cost of gasoline per gallon : ");
	costOfGasoline = sc.nextInt();
	System.out.println("Enter the average miles per gallon : ");
	avgMilesGallon = sc.nextInt();
	System.out.println("Enter the total parking fees per day : ");
	parkingFees = sc.nextInt();
	System.out.println("Enter the tolls per day : ");
	tolls = sc.nextInt();
	}
	

	public double calculatetotalcost() {
	double total = ((totalMiles * costOfGasoline)/ avgMilesGallon) + parkingFees + tolls;
	return total;
	}
	
	public void displaydetails() {
		System.out.println("Total Cost of Driving per day that would be saved by Car Pooling : " + calculatetotalcost());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
