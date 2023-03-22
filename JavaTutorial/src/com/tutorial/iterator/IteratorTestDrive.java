package com.tutorial.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTestDrive {
	
	public static void addCars(Collection<String> collection) {
		collection.add("Volvo");
		collection.add("BMW");
		collection.add("Ford");
		collection.add("Mazda");
	}
	
	public static void main(String[] args) {
		ArrayList<String> carArray = new ArrayList<>();
		IteratorTestDrive.addCars(carArray);
	    // Get the iterator
	    Iterator<String> itArray = carArray.iterator();
	    while(itArray.hasNext()) {
	    	System.out.println(itArray.next());
	    }
	    
	    HashSet<String> carSet = new HashSet<>();
		IteratorTestDrive.addCars(carSet);
	    // Get the iterator
	    Iterator<String> itSet = carSet.iterator();
	    while(itSet.hasNext()) {
	    	System.out.println(itSet.next());
	    }
	}
}
