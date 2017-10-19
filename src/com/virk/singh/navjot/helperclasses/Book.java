package com.virk.singh.navjot.helperclasses;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Book {
	int id, quantity;
	Double price;
	String name, authors[];
	AtomicInteger ID_GENERATOR = new AtomicInteger();
	Random randomNumber = new Random();

	public Book(String name, String authors[]) {
		id = ID_GENERATOR.incrementAndGet();
		this.quantity = randomNumber.nextInt(500);
		this.price = Math.random();
		this.name = name;
		this.authors = authors;

	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

}
