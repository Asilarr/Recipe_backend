package com.mine.RecipeExchangeHub.controller;



import com.mine.RecipeExchangeHub.Service.FollowerService;
import com.mine.RecipeExchangeHub.model.Follower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/follower")
public class FollowerController {
    @Autowired
    private FollowerService followerService;

    @PostMapping("/add")
    public String add(@RequestBody Follower follower){
        followerService.saveFollower(follower);
        return "New Follower added!";
    }
    @GetMapping("/getFollowers")
    public List<Follower> getFollowers(){
        return  followerService.getAllFollowers();
    }
}
