package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.CreateRecipe;

import java.util.List;

public interface CreateService {
    public CreateRecipe saveRecipes(CreateRecipe createRecipe);
    List<CreateRecipe> getAllRecipes();
}
