package com.example.shapeproject;

public class Amoeba extends Shape{
	@Override
	void rotate() {
		System.out.println("Rotate Amoeba!");
	}
	
	@Override
	void playSound() {
		System.out.println("Play Amoeba Sound!");
	}
}
