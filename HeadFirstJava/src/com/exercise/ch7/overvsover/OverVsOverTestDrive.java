package com.exercise.ch7.overvsover;

public class OverVsOverTestDrive {
	public static void main(String[] args) {
		System.out.println("Overriding Test");
		Appliance a = new Appliance();
		System.out.println(a.turnOn());
		
		Toaster t = new Toaster();
		System.out.println(t.turnOn());
		
		System.out.println("Overloading Test");
		
	}
}
