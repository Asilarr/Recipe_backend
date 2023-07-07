package com.mine.RecipeExchangeHub.repository;

import com.mine.RecipeExchangeHub.model.CreateRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateRepository extends JpaRepository<CreateRecipe,Long> {

}
