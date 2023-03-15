package com.exercise.ch7.animals;

import java.util.ArrayList;

public class AnimalSimulationTestDrive {

	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Lion());
		list.add(new Hippo());
		list.add(new Wolf());
		list.add(new Cat());
		list.add(new Dog());
		
		for (Animal i: list) { 
			i.roam();
			i.makeNoise();
		}
	}
	
}