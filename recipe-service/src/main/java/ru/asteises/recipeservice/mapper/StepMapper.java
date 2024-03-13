package ru.asteises.recipeservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.asteises.recipeservice.model.dto.StepViewDto;
import ru.asteises.recipeservice.model.entity.Step;

import java.util.List;

@Mapper(uses = {RecipesMapper.class})
public interface StepMapper {

    StepMapper INSTANCE = Mappers.getMapper(StepMapper.class);

    @Mapping(target = "title", source = "title")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "cookingTime", source = "cookingTime")
    @Mapping(target = "photoUrl", source = "photoUrl")
    StepViewDto toDto(Step step);

    List<StepViewDto> toDto(List<Step> steps);
}
