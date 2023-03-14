package com.exercise.ch4.lifeanddeath;

import java.util.ArrayList;

public class DogTestDrive {
	public static void main(String[] arge) {
		Dog arrow = DogFactory.comeIntoBeing();
		arrow.setSize(10);
		arrow.bark();
		

		ArrayList cars = new ArrayList();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
	}
}

