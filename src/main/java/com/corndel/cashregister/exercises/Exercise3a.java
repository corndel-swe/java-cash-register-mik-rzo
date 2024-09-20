package com.corndel.cashregister.exercises;

import java.util.List;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;

public class Exercise3a {
  /**
   * Given a recipeBook containing recipes, returns the last recipe
   * in the array.
   * 
   * Return null if there are no recipes.
   */
  public static Recipe lastRecipe(RecipeBook recipeBook) {
    List<Recipe> recipes = recipeBook.getRecipes();
    if (recipes.size() == 0) {
      return null;
    }
    int lastRecipeIndex = recipes.size() - 1;
    return recipes.get(lastRecipeIndex);
  }
}
