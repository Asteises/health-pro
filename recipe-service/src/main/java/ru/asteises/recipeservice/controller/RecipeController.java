package ru.asteises.recipeservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.asteises.recipeservice.model.dto.RecipeViewDto;
import ru.asteises.recipeservice.service.interfaces.RecipeService;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:49757")
@RequestMapping("api/v1/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping("/all")
    public ResponseEntity<List<RecipeViewDto>> getAllRecipes() {
        return new ResponseEntity<>(recipeService.getAllRecipes(), HttpStatus.OK);
    }
}
