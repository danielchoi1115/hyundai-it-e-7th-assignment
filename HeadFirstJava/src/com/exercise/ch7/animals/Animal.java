package com.exercise.ch7.animals;

public abstract class Animal {
	
	String pic;
	String food;
	String hunger;
	String boundaries;
	String location;
	
	void makeNoise() {
		System.out.println("소리!");
	}
	void eat() {
		System.out.println("먹기!");
	}
	void sleep() {
		System.out.println("자기!");
	}
	void roam() {
		System.out.println("돌아다니기!");
	}
}
