package com.apps.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void menu() {
		System.out.println("\n*******FRUIT_BASKET*******");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display Fruits Contained in Basket");
		System.out.println("5. Display Details of All Fruits");
		System.out.println("6. Display Taste of All Stale Fruits");
		System.out.println("7. Mark a Fruit as Stale");
		System.out.println("8. Mark all Sour Fruits as Stale");
		System.out.print("Enter your Choice: ");

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Numbers of Fruits to add: ");
		int n = scn.nextInt();
		int counter = 0;
		
		Fruit[] fruitBasket = new Fruit[n];
		
		while(true) {
			int opt;
			menu();
			opt = scn.nextInt();
			
			switch(opt) {
			
			//	EXIT Case
			case 0:
				System.out.println("*******Thanks for Visiting*******");
				return;
				
			//	MANGO ADDED	
			case 1:
				if(counter < n) {
					fruitBasket[counter] = new Mango();
					fruitBasket[counter].accept(scn);
					counter++;
					System.out.println("\n Mango added to Basket\n");
				}
				else
					System.out.println("Basket is Already Full!!! \n");
				
				break;
				
			//	ORANGE ADDED	
			case 2:
				if(counter < n) {
					fruitBasket[counter] = new Orange();
					fruitBasket[counter].accept(scn);
					counter++;
					System.out.println("\n Orange added to Basket\n");
				}
				else
					System.out.println("Basket is Already Full!!!\n ");
				
				break;
			
			//	APPLE ADDED
			case 3:
				if(counter < n) {
					fruitBasket[counter] = new Apple();
					fruitBasket[counter].accept(scn);
					counter++;
					System.out.println("\n Apple added to Basket\n");
				}
				else
					System.out.println("Basket is Already Full!!!\n ");
				
				break;
			
			//	DISPLAY FRUIT NAMES
			case 4:
				System.out.println("---------------");
				System.out.println("Total Fruits in the Basket are: ");
				for(Fruit fruit : fruitBasket) {
					if(fruit != null) {
						System.out.println(fruit.getName());
					}
					else
						System.out.println("Basket is Empty !!!\n");
				}
				break;
			
				
			//	DISPLAY FRUIT DETAILS
			case 5:
				System.out.println("---------------");
				System.out.println("Fruit Details are: ");
				for(Fruit fruit : fruitBasket) {
					if(fruit != null) {
						System.out.println(fruit.toString() + ", isFresh: " + fruit.isFresh());
					}
					else
						System.out.println("Basket is Empty !!!\n");
				}
				break;
				
				
			//	DISPLAY STALE FRUITS
			case 6:
				System.out.println("---------------");
				System.out.println("Taste of All Stale Fruits: ");
				for(Fruit fruit : fruitBasket) {
					if(!fruit.isFresh()) {
						System.out.println(fruit.taste());
					}
				}
				break;
				
				
			//	MARK STALE FRUIT
			case 7:
				System.out.print("Enter the Index of Fruit to Mark it Stale: ");
				int idx = scn.nextInt();
				if(idx < fruitBasket.length && idx >= 0)
					fruitBasket[idx].setFresh(false);
				else
					System.out.println("Invalid Index!!!");
				break;
				
				
			//	MARK ALL SOUR FRUIT AS STALE
			case 8:
				for(Fruit fruits : fruitBasket) {
					if(fruits.taste() == "Sour") {
						fruits.setFresh(false);
					}
				}
				break;
				
			default:
				System.out.println("Invalid Choice Retry!!!\n");
				
			}	// SWITCH
			
		}	// WHILE
		
		
	}	//	MAIN

}
