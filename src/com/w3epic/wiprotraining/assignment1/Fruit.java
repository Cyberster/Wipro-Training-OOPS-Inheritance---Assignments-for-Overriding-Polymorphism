package com.w3epic.wiprotraining.assignment1;

public class Fruit {
	protected String name;
	protected String taste;
	protected int size;
	
	public Fruit() {
		name = "Fruit name";
		taste = "Tase of the fruit";
		size = 0;
	}
	
	public void eat () {
		System.out.println(name + " tastes like " + taste);
	}
}
