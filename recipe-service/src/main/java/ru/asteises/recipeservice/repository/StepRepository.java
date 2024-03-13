package ru.asteises.recipeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.asteises.recipeservice.model.entity.Step;

import java.util.List;
import java.util.UUID;

@Repository
public interface StepRepository extends JpaRepository<Step, UUID> {

    @Query("""
            select distinct s from Step as s
            where s.recipe.id in :recipeIds
            """)
    List<Step> findAllByRecipeIdIn(List<UUID> recipeIds);
}
