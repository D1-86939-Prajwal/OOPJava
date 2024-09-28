package com.apps.fruits;

import java.util.Objects;
import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;	
	
	public Fruit() {

	}

	public Fruit(String color, double weight, String name) {

		this.color = color;
		this.weight = weight;
		this.name = name;
	}
	
	public void accept(Scanner scn) {
		System.out.print("Enter Fruit Name: ");
		name = scn.next();
		System.out.print("Enter Fruit Color: ");
		color = scn.next();
		System.out.print("Enter Fruit Weight: ");
		weight = scn.nextDouble();
	}
	
	

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Fruit)) {
			return false;
		}
		Fruit other = (Fruit) obj;
		return Objects.equals(color, other.color) && isFresh == other.isFresh && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	public String taste() {
		return "No Specific Taste";
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
