package com.mine.RecipeExchangeHub.model;

import jakarta.persistence.*;

@Entity
@Table(name = "follower")
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long follower_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User followerUser;

    @ManyToOne
    @JoinColumn(name = "followed_user_id")
    private User followedUser;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private CreateRecipe createRecipe;

    public Follower() {
    }

    public Long getFollower_id() {
        return follower_id;
    }

    public void setFollower_id(Long follower_id) {
        this.follower_id = follower_id;
    }
}
