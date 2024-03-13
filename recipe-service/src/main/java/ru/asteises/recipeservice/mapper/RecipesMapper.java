package ru.asteises.recipeservice.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import ru.asteises.recipeservice.model.dto.RecipeViewDto;
import ru.asteises.recipeservice.model.entity.Ingredient;
import ru.asteises.recipeservice.model.entity.Recipe;
import ru.asteises.recipeservice.model.entity.Step;

import java.util.List;

@Mapper(uses = {IngredientMapper.class, StepMapper.class})
public interface RecipesMapper {

    RecipesMapper INSTANCE = Mappers.getMapper(RecipesMapper.class);

    @Mapping(target = "name", source = "recipe.name")
    @Mapping(target = "category", source = "recipe.category")
    @Mapping(target = "cookingTime", source = "recipe.cookingTime")
    @Mapping(target = "ingredients", ignore = true)
    @Mapping(target = "steps", ignore = true)
    RecipeViewDto toDto(Recipe recipe, List<Ingredient> ingredients, List<Step> steps);

    @AfterMapping
    default void setData(@MappingTarget RecipeViewDto recipeViewDto, List<Ingredient> ingredients, List<Step> steps) {
        recipeViewDto.setIngredients(IngredientMapper.INSTANCE.toDto(ingredients));
        recipeViewDto.setSteps(StepMapper.INSTANCE.toDto(steps));
    }
}
