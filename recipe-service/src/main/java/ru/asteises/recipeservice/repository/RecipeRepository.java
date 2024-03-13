package ru.asteises.recipeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.recipeservice.model.entity.Recipe;

import java.util.UUID;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, UUID> {

//    @Query("""
//            select distinct r from Recipe as r
//            """)
//    List<Recipe> getAllWithIngredients();

//    @Query("""
//            select distinct r from Recipe as r
//            left join fetch r.steps as s
//            where r in :recipes
//            """)
//    List<Recipe> getAllWithStepsByRecipeWithIngredients(List<Recipe> recipes);
}
