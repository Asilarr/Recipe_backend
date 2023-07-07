package com.mine.RecipeExchangeHub.repository;

import com.mine.RecipeExchangeHub.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite,Long> {
}
