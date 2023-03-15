package com.exercise.ch7.overvsover;

public class Toaster extends Appliance {
	@Override
	boolean turnOn() {
		System.out.println("Overriden");
		return true;
	}
}
