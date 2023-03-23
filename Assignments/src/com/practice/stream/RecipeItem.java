package com.practice.stream;

public class RecipeItem {
	private String ingredientName;
	private String amount;
	
	
	public RecipeItem(String ingredientName, String amount) {
		super();
		this.ingredientName = ingredientName;
		this.amount = amount;
	}


	public String getIngredientName() {
		return ingredientName;
	}


	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}


	public String getamount() {
		return amount;
	}


	public void setamount(String amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return ingredientName + " " + amount;
	}
	
	
}
