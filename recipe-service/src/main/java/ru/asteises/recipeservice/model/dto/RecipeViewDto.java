package ru.asteises.recipeservice.model.dto;

import lombok.*;

import java.time.LocalTime;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecipeViewDto {

    private String name;
    private String category;
    private LocalTime cookingTime;
    private List<IngredientViewDto> ingredients;
    private List<StepViewDto> steps;
}
