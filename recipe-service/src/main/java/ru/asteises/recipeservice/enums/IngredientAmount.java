package ru.asteises.recipeservice.enums;

import lombok.Getter;

@Getter
public enum IngredientAmount {
    TEASPOON("чайная ложка"),
    TABLESPOON("столовая ложка"),
    GLASS("стакан"),
    CUP("чашка");

    private final String name;

    IngredientAmount(String name) {
        this.name = name;
    }
}
