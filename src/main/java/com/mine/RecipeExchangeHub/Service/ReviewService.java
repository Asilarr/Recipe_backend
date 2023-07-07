package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.Review;

import java.util.List;

public interface ReviewService {
    public Review saveReviews(Review review);
    List<Review> getAllReviews();
}
