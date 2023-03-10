package com.exercise.ch2.guessgame;

public class Player {
	private int number = 0;
	
	public int getNumber() {
		return number;
	}
	
	public void guess() {
		this.number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}
