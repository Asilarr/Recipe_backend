package com.mine.RecipeExchangeHub.repository;

import com.mine.RecipeExchangeHub.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
}
