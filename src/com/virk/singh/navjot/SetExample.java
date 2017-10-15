package com.virk.singh.navjot;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static nsv.custom.utilities.Print.*;

public class SetExample {

	// HashSet | Use where order and sorting is not important
	private static Set<String> names = new HashSet<>();
	
	//LinkedHashet | Use where the order in which elements are added is important
	private static Set<String> namesInOrder = new LinkedHashSet<>();
	
	//TreeSet | Use where you require sorted results
	private static Set<String> sortedNames = new TreeSet<>();

	public static void main(String[] args) {

		// adding values to the set (HashSet) and printing the values
		names = addValuesTo(names);
		prettyPrint("HashSet Results", names.toString());

		// adding the values to LinkedHashSet (this set remembers the order) and printing
		namesInOrder = addValuesTo(namesInOrder);
		prettyPrint("LinkedHashSet Results", namesInOrder.toString());

		// adding the values to TreeSet(this set sorts the elements) and printing
		sortedNames = addValuesTo(sortedNames);
		prettyPrint("TreeSet Results", sortedNames.toString());
	}

	/*
	 * this function receives the variable name of the set, and allows us to add
	 * values to the set according to its type - HashSet, LinkedHashSet, or TreeSet
	 * and removes the need to repeat code in order to demonstrate all types of sets
	 * with the same input values
	 */
	public static Set<String> addValuesTo(Set<String> name) {
		name.add("Navjot Singh");
		name.add("Jashan Deep");
		name.add("Ranbir Singh");
		name.add("Amrit Singh");
		name.add("Baljinder Kaur");
		name.add("Kuldeep Virk");
		println("No. of Elements: "+name.size());
		
		//duplicate values (In sets duplicates are ignored)
		
		name.add("Ranbir Singh");
		name.add("Amrit Singh");
		name.add("Baljinder Kaur");
		name.add("Kuldeep Virk");
		println("No. of Elements after adding duplicates: "+name.size());
		
		return name;
	}
}
