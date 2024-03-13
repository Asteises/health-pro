package ru.asteises.recipeservice.service.interfaces;

import ru.asteises.recipeservice.model.dto.RecipeViewDto;

import java.util.List;

public interface RecipeService {

    List<RecipeViewDto> getAllRecipes();
}
