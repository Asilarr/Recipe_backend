package com.mine.RecipeExchangeHub.controller;

import com.mine.RecipeExchangeHub.Service.ReviewService;
import com.mine.RecipeExchangeHub.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/add")
    public String add(@RequestBody Review review){
        reviewService.saveReviews(review);
        return "New review added!";
    }
    @GetMapping("/getReviews")
    public List<Review> getReviews(){
        return reviewService.getAllReviews();
    }
}
