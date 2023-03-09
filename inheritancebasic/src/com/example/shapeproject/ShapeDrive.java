package com.example.shapeproject;

public class ShapeDrive {

	public static void main(String[] args) {
		Shape s = new Square();
		s.rotate();
		s.playSound();
		
		Shape a = new Amoeba();
		a.rotate();
		a.playSound();
	}
	
}
