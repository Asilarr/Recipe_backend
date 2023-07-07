package com.mine.RecipeExchangeHub.controller;

import com.mine.RecipeExchangeHub.Service.FollowingService;
import com.mine.RecipeExchangeHub.model.Following;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/following")
public class FollowingController {
    @Autowired
    private FollowingService followingService;

    @PostMapping("/add")
    public String add(@RequestBody Following following){
        followingService.saveFollowing(following);
        return "New Following added!";
    }

    @GetMapping("/getFollowing")
    public List<Following> getFollowing(){
        return followingService.getAllFollowing();
    }
}
