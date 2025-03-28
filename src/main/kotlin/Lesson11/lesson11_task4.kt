package org.example.Lesson11

import java.awt.Image

class RecipeCategory(name: String, description: String, image: Image, recipeList: MutableList<Recipe>) {

}

class Recipe(image: Image, name: String, cookingMethod: String, ingredientList: MutableList<Ingredient>) {

}

class Ingredient(name: String, quantity: Double, measure: String) {

}