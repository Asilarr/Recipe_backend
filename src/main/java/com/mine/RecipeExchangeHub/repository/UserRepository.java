package com.mine.RecipeExchangeHub.repository;

import com.mine.RecipeExchangeHub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
