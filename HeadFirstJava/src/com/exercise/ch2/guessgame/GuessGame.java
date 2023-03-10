package com.exercise.ch2.guessgame;

public class GuessGame {
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();

	public void startGame() {
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");

		while (true) {
			p1.guess();
			p2.guess();
			p3.guess();
			if (p1.getNumber() == targetNumber) {
				p1isRight = true;
			}
			if (p2.getNumber() == targetNumber) {
				p1isRight = true;
			}
			if (p3.getNumber() == targetNumber) {
				p1isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over");
				break;
			}
			System.out.println("Players will have to try again.");
		}
	}
}
