package com.virk.singh.navjot.helperclasses;

import java.util.concurrent.atomic.AtomicInteger;

public class Store {
	private int id;
	private String name;
	private AtomicInteger ID_GENERATOR = new AtomicInteger();

	public Store(String name) {
		id = ID_GENERATOR.getAndIncrement();
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
