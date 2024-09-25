package com.Question_1;
import java.util.*;
public class Invoice {
	int number ;
	String description;
	int quantity;
	double price;
	
	
	public static Scanner sc = new Scanner(System.in);
	public Invoice() {
		number = 10;
		description = "iPhone";
		quantity = 20;
		price = 100;
	}

	public Invoice(int number, String description, int quantity, double price) {
		super();
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	public double itemTotalprice() {
		if(quantity < 0) {
			quantity = 0;
		}
		if(price < 0) {
			price = 0.0;
		}
		
		double total = quantity * price;
		System.out.println("The Total Amount is : "+ total);
		return 0;
	}
	
	public static void main(String args[]) {

	}

}
