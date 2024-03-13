package ru.asteises.recipeservice.model.dto;

import lombok.*;

import java.time.LocalTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StepViewDto {

    private String title;
    private String description;
    private LocalTime cookingTime;
    private String photoUrl;
}
