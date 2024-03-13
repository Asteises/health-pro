package ru.asteises.recipeservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.asteises.recipeservice.mapper.RecipesMapper;
import ru.asteises.recipeservice.model.dto.RecipeViewDto;
import ru.asteises.recipeservice.model.entity.Ingredient;
import ru.asteises.recipeservice.model.entity.Recipe;
import ru.asteises.recipeservice.model.entity.Step;
import ru.asteises.recipeservice.repository.IngredientRepository;
import ru.asteises.recipeservice.repository.RecipeRepository;
import ru.asteises.recipeservice.repository.StepRepository;
import ru.asteises.recipeservice.service.interfaces.RecipeService;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final IngredientRepository ingredientRepository;
    private final StepRepository stepRepository;

    @Override
    public List<RecipeViewDto> getAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        List<UUID> recipeIds = recipes.stream().map(Recipe::getId).toList();

        List<Ingredient> ingredients = ingredientRepository.findAllByRecipeIdIn(recipeIds);
        Map<UUID, List<Ingredient>> ingredientsByRecipeId = ingredients.stream().collect(groupingBy(ingredient -> ingredient.getRecipe().getId()));

        List<Step> steps = stepRepository.findAllByRecipeIdIn(recipeIds);
        Map<UUID, List<Step>> stepsByRecipeId = steps.stream().collect(groupingBy(step -> step.getRecipe().getId()));

        return setData(recipes, ingredientsByRecipeId, stepsByRecipeId);
    }

    private List<RecipeViewDto> setData(
            List<Recipe> recipes,
            Map<UUID, List<Ingredient>> ingredientsByRecipe,
            Map<UUID, List<Step>> stepsByRecipe) {

        List<RecipeViewDto> result = new ArrayList<>();
        for (Recipe recipe : recipes) {
            log.debug("recipe: {}", recipe);
            List<Ingredient> ingredients = ingredientsByRecipe.getOrDefault(recipe.getId(), Collections.emptyList());
            log.debug("ingredients: {}", ingredients);
            List<Step> steps = stepsByRecipe.getOrDefault(recipe.getId(), Collections.emptyList());
            log.debug("steps: {}", steps);
            RecipeViewDto recipeViewDto = RecipesMapper.INSTANCE.toDto(recipe, ingredients, steps);
            result.add(recipeViewDto);
        }
        return result;
    }

}
