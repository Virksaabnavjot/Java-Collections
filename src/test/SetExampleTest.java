package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import com.virk.singh.navjot.SetExample;
import static nsv.custom.utilities.Print.*;

class SetExampleTest {
	//JUnit 4 vs Junit 5 | https://howtoprogram.xyz/2016/08/10/junit-5-vs-junit-4/
	//JUnit 5 Assertions Example | https://howtoprogram.xyz/2016/08/12/junit-5-assertions-example/
	
	@Test
	void testSize() {
		SetExample s = new SetExample();
		Set <String> names = new HashSet<>();
		names = s.addValuesTo(names);
		println(names.toString());
		
		//assertEquals(expected value, actual value)
		assertEquals(6, names.size());	
	}
	
	@Test
	void testIsEmpty() {
		SetExample s = new SetExample();
		Set <String> names = new HashSet<>();
		
		assertEquals(true, names.isEmpty());
	}
	
	@Test
	void testContains() {
		SetExample s = new SetExample();
		Set <String> names = new HashSet<>();
		names = s.addValuesTo(names);
		
		//Asserts that a condition is true.
		assertTrue(names.contains("Navjot Singh"));
		//Asserts that a condition is false.
		assertFalse(names.contains("Cat"));
	}
	
	@Test
	void testRemove() {
		SetExample s = new SetExample();
		Set <String> names = new HashSet<>();
		names = s.addValuesTo(names);
		
		//testing if the following names exists in the set
		assertTrue(names.contains("Navjot Singh"));
		assertTrue(names.contains("Jashan Deep"));
		
		//remove the names from the set
		names.remove("Navjot Singh");
		names.remove("Jashan Deep");
		
		//test/check if the names were removed or still exist in the set
		assertTrue(!names.contains("Navjot Singh"));
		assertTrue(!names.contains("Jashan Deep"));
		
		//assertAll() example
		assertAll("Do many assertions.", () -> {
		      assertNotNull(1);
		      assertEquals(1, 1);
		    });
		
	}

}
