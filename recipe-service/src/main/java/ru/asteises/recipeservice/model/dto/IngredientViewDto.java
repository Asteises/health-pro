package ru.asteises.recipeservice.model.dto;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngredientViewDto {

    private String name;
    private String amount;
}
