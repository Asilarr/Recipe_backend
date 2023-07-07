package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.Following;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FollowingService {
    public Following saveFollowing(Following following);
    List<Following> getAllFollowing();
}
