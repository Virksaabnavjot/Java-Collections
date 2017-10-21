package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.virk.singh.navjot.QueueExample;
import com.virk.singh.navjot.helperclasses.Product;

import static nsv.custom.utilities.Print.*;

class QueueExampleTests {
	QueueExample qe = new QueueExample();
	Queue<Product> productsQueue = new LinkedList();
	
	@BeforeEach
	void setUp() throws Exception {
		productsQueue = qe.getProductsQueue();
		//qe.addProductsToTheQueue();
	}

	@Test
	void testQueueIsEmpty() {
		assertTrue(productsQueue.isEmpty());
		println(productsQueue);
	}
	
	@Test
	void testQueueIsNotEmpty() {
		qe.addProductsToTheQueue();
		assertFalse(productsQueue.isEmpty());
	}
	

}
