package com.tutorial.generics;

public class BoxTestDrive {
	public static void main(String[] args) {
		Box<Planet> box = new Box<>();
		box.set(Planet.EARTH);
		
		Planet boysPlanet = box.get();
		
		System.out.println(boysPlanet.surfaceGravity());
	}
}
