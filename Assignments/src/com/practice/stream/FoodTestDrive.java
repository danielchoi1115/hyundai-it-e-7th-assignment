package com.practice.stream;

import java.util.List;

public class FoodTestDrive {
	public static void main(String[] args) {
		List<Food> roaster = Food.createRoaster();

		System.out.println("맛있는 요리 레시피 출력해줘.\n");
		
		roaster.stream().
			filter(r -> r.getQuality() == FoodQuality.Delicous)
			.map(r -> r.toString())
			.forEach(foodInfo -> System.out.println(foodInfo + "\n"));
	}
}
