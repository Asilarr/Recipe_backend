package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.Review;
import com.mine.RecipeExchangeHub.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review saveReviews(Review review){
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }
}
