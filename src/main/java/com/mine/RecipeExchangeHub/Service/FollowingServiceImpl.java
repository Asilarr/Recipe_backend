package com.mine.RecipeExchangeHub.Service;


import com.mine.RecipeExchangeHub.model.Following;
import com.mine.RecipeExchangeHub.repository.FollowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowingServiceImpl implements FollowingService{
    @Autowired
    private FollowingRepository followingRepository;

    @Override
    public Following saveFollowing(Following following){
        return followingRepository.save(following);
    }

    @Override
    public List<Following> getAllFollowing(){
        return followingRepository.findAll();
    }
}
