package com.virk.singh.navjot;

import static nsv.custom.utilities.Print.*;
import com.virk.singh.navjot.helperclasses.*;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	private static Queue<Product> productsQueue = new LinkedList();

	public static Queue<Product> getProductsQueue() {
		return productsQueue;
	}

	public static void setProductsQueue(Queue<Product> productsQueue) {
		QueueExample.productsQueue = productsQueue;
	}

	public static void main(String[] args) {
		
		/*Now, let do something better - Automation Testing using 
		 * JUnit 5
		 * Package: test
		 * File: QueueExampleTests.java
		 */
        
		//Some Manual Testing
		addProductsToTheQueue();
		println(productsQueue);
		println(productsQueue.poll()); // retrieves and removes the head of the queue
		println(productsQueue.poll());
		println(productsQueue); // printing the queue again
	}

	public static void addProductsToTheQueue() {
		productsQueue.add(new Product("Iphone 5s", 125)); // name and weight
		productsQueue.add(new Product("Protein Shaker", 349));
		productsQueue.add(new Product("Milk Chocolate", 200));
		productsQueue.add(new Product("Sweet Candy", 19));
		productsQueue.add(new Product("Pink Milk Cup", 99));
	}
}
