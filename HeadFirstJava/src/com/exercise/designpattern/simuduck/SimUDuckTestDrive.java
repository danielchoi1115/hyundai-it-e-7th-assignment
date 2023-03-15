package com.exercise.designpattern.simuduck;

public class SimUDuckTestDrive {
	public static void main(String[] args) {
		Duck d = new MallardDuck();
		d.performFly();
		d.performQuack();
	}
}
