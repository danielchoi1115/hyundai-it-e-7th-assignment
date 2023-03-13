package com.exercise.ch4.lifeanddeath;

public class DogTestDrive {
	public static void main(String[] arge) {
		Dog arrow = DogFactory.comeIntoBeing();
		arrow.setSize(10);
		arrow.bark();
	}
}

