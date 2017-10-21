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

		//Some Manual Testing
		println(productsQueue);
		println(productsQueue.poll()); // retrieves and removes the head of the queue
		println(productsQueue.poll());
		println(productsQueue); // printing the queue again
		
		/*Now, let do something better - Automation Testing using 
		 * JUnit 5
		 * Package: test
		 * 
		 */
        
	}

	public static void addProductsToTheQueue() {
		
	}
}
