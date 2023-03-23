package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Food {
	private String foodName;
	private Recipe recipe;
	private FoodQuality quality;
	
	public Food(String foodName, Recipe recipe, FoodQuality quality) {
		super();
		this.foodName = foodName;
		this.recipe = recipe;
		this.quality = quality;
	}
	
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Recipe getIngredient() {
		return recipe;
	}

	public void setIngredient(Recipe recipe) {
		this.recipe = recipe;
	}

	public FoodQuality getQuality() {
		return quality;
	}

	public void setQuality(FoodQuality quality) {
		this.quality = quality;
	}
	
	@Override
	public String toString() {
		return "음식 이름: " + foodName + "\n 레시피: " + recipe.toString();
	}
	
	public static List<Food> createRoaster() {
		Recipe r1 = new Recipe(
				new ArrayList<>(Arrays.asList(
						new RecipeItem("레몬", "2마리"),
						new RecipeItem("꿀", "2스푼"),
						new RecipeItem("지렁이", "1마리"),
						new RecipeItem("머랭", "300g"),
						new RecipeItem("박력분", "200g")
						)
				)
		);
		Food f1 = new Food("레몬허니지렁이카스테라", r1, FoodQuality.Delicous);
		
		Recipe r2 = new Recipe(
				new ArrayList<>(Arrays.asList(
						new RecipeItem("토마토", "2개"),
						new RecipeItem("계란", "3알"),
						new RecipeItem("설탕", "2큰술"),
						new RecipeItem("물", "300ml")
						)
				)
		);
		Food f2 = new Food("토마토계란수프", r2, FoodQuality.Okay);
		
		Recipe r3 = new Recipe(
				new ArrayList<>(Arrays.asList(
						new RecipeItem("도마뱀", "1마리"),
						new RecipeItem("된장", "2큰술"),
						new RecipeItem("김칫국물", "3숟가락"),
						new RecipeItem("물", "500ml")
						)
				)
		);
		Food f3 = new Food("도마뱀된장국", r3, FoodQuality.Delicous);
		
		return new ArrayList<>(Arrays.asList(f1, f2, f3));
	}
}
