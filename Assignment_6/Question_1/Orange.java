package com.apps.fruits;

public class Orange extends Fruit {
	
	@Override
	public String taste() {
		
		return "Sour";
	}
	
	@Override
	public String toString() {
		return super.toString() + " Orange[taste =" + taste() + "]";
	}

}
