package com.apps.fruits;

public class Apple extends Fruit {
	
	@Override
	public String taste() {
		return "Sweet-n-Sour";
	}
	
	@Override
	public String toString() {
		return super.toString() + " Apple[taste =" + taste() + "]";
	}

}
