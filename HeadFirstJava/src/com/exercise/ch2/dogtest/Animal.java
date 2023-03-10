package com.exercise.ch2.dogtest;

public class Animal {
	private int size;
	private String name;
	private String breed;
	int getSize() {return size;}
	String getName() {return name;}
	String getBreed() {return breed;}
	
	
	void setSize(int size) {
		if (size <= 0) {
			System.out.println("Size는 0보다 커야합니다.");
			return;
		} 
		this.size = size;
		
	}
	void setName(String name) {this.name = name;}

	void setBreed(String breed) {this.breed = breed;}
	
}
