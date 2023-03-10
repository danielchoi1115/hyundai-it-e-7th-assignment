package com.exercise.ch2.dogtest;

public class DogTestDrive {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setSize(40);
		d.bark();

		Cat c = new Cat();
		c.setName("나비");
		c.punchPaw();
	}
}
