package com.mine.RecipeExchangeHub.model;

import jakarta.persistence.*;
import lombok.Builder;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Entity
@Table(name = "recipe")
public class CreateRecipe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long recipe_id;


    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "createRecipe")
    private List<Follower> follower;

    @OneToMany(mappedBy = "createRecipe")
    private List<Following> following;
    @OneToMany(mappedBy = "createRecipe")
    private List<Review> reviews;
    @OneToMany(mappedBy = "createRecipe")
    private List<Favorite> favorites;
    private String title;
    private String description;

    private List<String> ingredients;
    private List<String>  steps;
    private int servings;
    private int preparationTime;

    public CreateRecipe() {
    }

    public Long getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(Long recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }


}
