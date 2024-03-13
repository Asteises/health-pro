package ru.asteises.recipeservice.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    private UUID id;
    private String name;
    private String category;
    private String amount;
    @Column(name = "cooking_time")
    private LocalTime cookingTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", amount='" + amount + '\'' +
                ", cookingTime=" + cookingTime +
                '}';
    }
}
