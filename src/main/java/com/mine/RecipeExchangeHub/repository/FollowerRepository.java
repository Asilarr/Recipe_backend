package com.mine.RecipeExchangeHub.repository;

import com.mine.RecipeExchangeHub.model.Follower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowerRepository extends JpaRepository<Follower,Long> {
}
