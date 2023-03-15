package com.exercise.designpattern.simuduck;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm Flying!!");
	}
}
