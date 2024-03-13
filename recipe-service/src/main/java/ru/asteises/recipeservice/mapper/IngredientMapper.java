package ru.asteises.recipeservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.asteises.recipeservice.model.dto.IngredientViewDto;
import ru.asteises.recipeservice.model.entity.Ingredient;

import java.util.List;

@Mapper(uses = {RecipesMapper.class})
public interface IngredientMapper {

    IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "amount", source = "amount")
    IngredientViewDto toDto(Ingredient ingredient);

    List<IngredientViewDto> toDto(List<Ingredient> ingredients);
}
