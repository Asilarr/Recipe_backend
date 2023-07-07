package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.Follower;

import org.springframework.stereotype.Service;

import java.util.List;


public interface FollowerService {
    public Follower saveFollower(Follower follower);

    List<Follower> getAllFollowers();
}
