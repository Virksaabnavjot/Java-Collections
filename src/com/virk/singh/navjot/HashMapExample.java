package com.virk.singh.navjot;

import com.virk.singh.navjot.helperclasses.*;
import static nsv.custom.utilities.Print.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapExample {

	private static HashMap<Store, Book> bookStore = new HashMap<>();
	private static ArrayList<Book> books = new ArrayList<>();
	private static ArrayList<Store> stores = new ArrayList<>();

	public static void main(String[] args) {
		getBooks();
		getStores();

		print();

	}

	private static void print() {
		printBookAtIndex(0);
		printAllBooks();
		printAllStores();
	}

	private static void getBooks() {
		books.add(new Book("The Jungle King", new String[] { "Billu Cheetah", "Gillu Lion", "Tillu Monkey" }));
		books.add(new Book("Gym and Nutrition", new String[] { "Navjot Singh Virk" }));
		books.add(new Book("Money Machine", new String[] { "Chiku Robbins", "Chuck Adams" }));
	}
	
	private static void getStores() {
		stores.add(new Store("Easons"));
		stores.add(new Store("Twinkle Tisons"));

	}

	private static void printBookAtIndex(int index) {
		Book book = books.get(index);
		println("Id: " + book.getId());
		println("Name: " + book.getName());
		println("Quantity: " + book.getQuantity());
		println("Price: " + book.getPrice() + " €");
		int i = 0;
		for (String author : book.getAuthors()) {
			println("Author Name " + i + ": " + author);
			i++;
		}

	}

	private static void printAllBooks() {
		prettyPrint("All Books", "");
		for (int index = 0; index <= books.size() - 1; index++) {
			Book book = books.get(index);
			println("Id: " + book.getId());
			println("Name: " + book.getName());
			println("Quantity: " + book.getQuantity());
			println("Price: " + book.getPrice() + " €");
			int i = 0;
			for (String author : book.getAuthors()) {
				println("Author Name " + i + ": " + author);
				i++;
			}
			println("---------------------------");
		}
	}

	private static void printAllStores() {
		prettyPrint("All Stores", "");
		for (int index = 0; index <= stores.size() - 1; index++) {
			Store store = stores.get(index);
			println("Id: " + store.getId());
			println("Name: " + store.getName());
			println("--------------------------");
		}
	}
}
