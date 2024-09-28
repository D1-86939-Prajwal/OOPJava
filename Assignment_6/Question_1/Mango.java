package com.apps.fruits;

public class Mango extends Fruit {
	
	@Override
	public String taste() {
		
		return "Sweet";
	}
	
	@Override
	public String toString() {
		return super.toString() + " Mango[taste =" + taste() + "]";
	}

}
