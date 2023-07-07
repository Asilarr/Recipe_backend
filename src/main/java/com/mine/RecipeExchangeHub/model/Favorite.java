package com.mine.RecipeExchangeHub.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "favorite")
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favorite_id;
    @ManyToMany(mappedBy = "favorites")
    private List<User> users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    private CreateRecipe createRecipe;

    @OneToMany(mappedBy = "favorite")
    private List<Review> reviews;
}
