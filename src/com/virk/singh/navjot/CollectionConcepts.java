package com.virk.singh.navjot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import static nsv.custom.utilities.Print.*;

public class CollectionConcepts {

	private static Collection<Product> products = new ArrayList<>();

	public static void main(String[] args) {
		// Product bed = new Product("Wooden Bed", 100);
		createNewProduct("Wooden Bed", 100);
		createNewProduct("Cricket Bat", 50);
		createNewProduct("Black Chair", 40);
		createNewProduct("Purple Blanket", 20);
		createNewProduct("Ball Pen", 10);

		// condition with one condition
		MyCondition condition = new MyCondition(50, false);

		// condition with two or more conditions
		MyCondition conditions = new MyCondition(new int[] { 2, 1, 4 }, true);
		// remove product
		removeProductsUsingIterator(condition);
		removeProductsUsingIterator(conditions);
		//print products
		printProducts();
		//other methods into play
		runOtherAvailableCommonCollectionMethods(products);

	}

	public static void createNewProduct(String name, int weight) {
		Product product = new Product(name, weight);
		println("Newly added Product " + product);
		products.add(product);
	}

	public static void printProducts() {
		// printing all the products using for-each loop
		for (Product product : products) {
			println(product.toString());
		}
	}

	public static void removeProductsUsingIterator(MyCondition condition) {
		/*
		 * removing product from the list using Iterator by passing a condition as a
		 * parameter printing all products using Iterator in java Not, used often
		 * for-each is a good option, but this can be helpful in other contexts such as
		 * removing an element.
		 */
		final Iterator<Product> iterator = products.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();

			if (condition.getAction() == false) {
				//nested if-else statement
				if (product.getWeight() < condition.getCondition()) {
					iterator.remove();
					println("Product was removed becuase Weight = " + product.getWeight() + " and condition was: "
							+ condition.getCondition() + "");
				} else {
					println("Product was NOT removed becuase Weight = " + product.getWeight()
							+ " and condition was: " + condition.getCondition() + "");
				}
			} //end of if statement
			else if(condition.getAction()==true){
				int index = 0;
				int arrayOfConditions[]= condition.getConditions();
				for(int conditions: arrayOfConditions) {
			    index++;
				println("Index "+index+" and Condition: "+conditions);
				}
				
			}
			else {
				println("Something went wrong with action");
			}//end of else statement
			
		}//end of while loop

	}//end of function

	public static void runOtherAvailableCommonCollectionMethods(Collection<Product> products) {
		println("size(): "+products.size());
		println("isEmpty(): "+products.isEmpty());
		println("contains(element): "+products.contains(new Product("Temperory Product",80)));
		products.add(new Product("Temperory Product",80)); //add element at the begining of the collection
		printProducts();
		println("-------addAll()-------------");
		Collection<Product> temperoryProducts = products;
		products.addAll(temperoryProducts); //add all elements of argument collection to this collection
		printProducts();
		println("--------clear()------------");
		products.clear();
		printProducts();
	
	}
	
}