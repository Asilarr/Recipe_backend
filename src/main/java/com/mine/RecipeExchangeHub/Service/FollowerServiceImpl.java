package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.Follower;
import com.mine.RecipeExchangeHub.repository.FollowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowerServiceImpl implements FollowerService {
    @Autowired
    private FollowerRepository followerRepository;


    @Override
    public Follower saveFollower(Follower follower){
        return followerRepository.save(follower);
    }

    @Override
    public List<Follower> getAllFollowers(){
        return followerRepository.findAll();
    }
}
