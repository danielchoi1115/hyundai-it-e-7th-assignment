package com.exercise.ch7.animals;

public class Dog extends Canine {
	
	@Override
	void makeNoise() {
		System.out.println("멍!");
	}
	@Override
	void eat() {
		System.out.println("멍멍!");
	}
	
}
