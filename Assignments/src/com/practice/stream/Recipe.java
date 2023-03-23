package com.practice.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Recipe {
	private ArrayList<RecipeItem> recipeItems;

	
	public Recipe(ArrayList<RecipeItem> recipeItems) {
		super();
		this.recipeItems = recipeItems;
	}

	public ArrayList<RecipeItem> getRecipeItems() {
		return recipeItems;
	}

	public void setRecipeItems(ArrayList<RecipeItem> recipeItems) {
		this.recipeItems = recipeItems;
	}

	@Override
	public String toString() {
		return recipeItems.
				stream().
				map(r -> r.toString()).
				collect(Collectors.joining(", "));

	}
	
}
