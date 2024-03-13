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
@Table(name = "steps")
public class Step {

    @Id
    private UUID id;
    private String title;
    private String description;
    @Column(name = "cooking_time")
    private LocalTime cookingTime;
    @Column(name = "photo_url")
    private String photoUrl;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Step step = (Step) o;
        return Objects.equals(id, step.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Step{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", cookingTime=" + cookingTime +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }
}
