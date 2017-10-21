package com.virk.singh.navjot;

import static nsv.custom.utilities.Print.*;
import com.virk.singh.navjot.helperclasses.*;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Product> productsQueue = new LinkedList();
		productsQueue.add(new Product("Iphone 5s", 125)); //name and weight
		productsQueue.add(new Product("Protein Shaker", 349));
		productsQueue.add(new Product("Milk Chocolate", 200));
		productsQueue.add(new Product("Sweet Candy", 19));
		productsQueue.add(new Product("Pink Milk Cup", 99));
		
		println(productsQueue);
		
		println(productsQueue.poll()); //retrieves and removes the head of the queue
		println(productsQueue.poll());
		
		println(productsQueue); //printing the queue again
		
	}

}
