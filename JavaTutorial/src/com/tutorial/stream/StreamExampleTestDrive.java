package com.tutorial.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamExampleTestDrive {

	
	public static void forEachExample() {
		List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
		list.stream()
		.forEach(System.out::println);
	}
	
	public static void mapExample() {
		List<String> list = new ArrayList<>(
				Arrays.asList("one", "two", "three"));
		
		list.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
	}
	
	public static void reduceExample() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Integer totalSum = list
				.stream()
				.reduce(0, (a, b) -> a+b);
		System.out.println(totalSum);
	}
	
	public static void main(String[] args) {
//		StreamExampleTestDrive.forEachExample();
//		StreamExampleTestDrive.mapExample();
//		StreamExampleTestDrive.andThenVsComposeExample();
		StreamExampleTestDrive.reduceExample();
		
	}
		
}
