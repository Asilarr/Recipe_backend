package com.mine.RecipeExchangeHub.controller;

import com.mine.RecipeExchangeHub.Service.FavoriteService;
import com.mine.RecipeExchangeHub.model.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorite")
public class FavoriteController {
    @Autowired
    private FavoriteService favoriteService;

    @PostMapping("add")
    public String add(@RequestBody Favorite favorite){
        favoriteService.saveFavorite(favorite);
        return "New favorite recipe added!";
    }

    @GetMapping("/getFavorites")
    public List<Favorite> getFavorites(){
        return favoriteService.getAllFavorites();
    }
}
