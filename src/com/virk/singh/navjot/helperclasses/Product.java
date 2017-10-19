package com.virk.singh.navjot.helperclasses;

public class Product {
	
	//variables
	private String name;
	private int weight;
	
	//constructor
	public Product(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		String newString = "Product { Name: " +name+ ", Weight: " +weight+ " }";
		return newString;
	}
	
}
