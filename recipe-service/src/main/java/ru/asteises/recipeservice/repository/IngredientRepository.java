package ru.asteises.recipeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.asteises.recipeservice.model.entity.Ingredient;

import java.util.List;
import java.util.UUID;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, UUID> {

    @Query("""
            select distinct i from Ingredient as i
            where i.recipe.id in :recipeIds
            """)
    List<Ingredient> findAllByRecipeIdIn(List<UUID> recipeIds);
}
