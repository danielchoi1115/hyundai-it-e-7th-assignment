package com.tutorial.boundedparameters;

public class CompareTestDrive {
	public static void main(String[] args) {
		Compare<String> stringExample = new Compare<>("Hello");
	    System.out.println("Data: " + stringExample.getData());
	    System.out.println("Is greater than 'World': " + stringExample.isGreaterThan("World"));
	    
	    Compare<Integer> integerExample = new Compare<>(1);
	    System.out.println("Data: " + integerExample.getData());
	    System.out.println("Check if greater than 1124: " + integerExample.isGreaterThan(1124));
	}
}
