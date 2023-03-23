package com.tutorial.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfaceTestDrive {
	public static void andThenVsComposeExample() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		Function<Integer, Integer> square = x -> x * x;
		Function<Integer, Integer> addThree = x -> x + 3;
		
		System.out.println("andThen performs x * x And Then x + 3");
		System.out.println("-> (x * x) + 3");
		list.stream()
			.map(square.andThen(addThree))
			.forEach(System.out::println);
		
		System.out.println("On the other hand, composed is composition");
		System.out.println("-> x * (x + 3)");
		list.stream()
			.map(square.compose(addThree))
			.forEach(System.out::println);
	}
}
