package com.exercise.designpattern.simuduck;

public class Quack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
