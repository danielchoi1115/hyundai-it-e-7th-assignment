package com.exercise.ch7.animals;

public class AnimalSimulationTestDrive {

	public static void main(String[] args) {
		Animal a1 = new Lion();
		a1.makeNoise();
		a1.eat();
		
		Animal a2 = new Hippo();
		a2.roam();
	}
	
}