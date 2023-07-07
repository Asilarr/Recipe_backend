package com.mine.RecipeExchangeHub.controller;

import com.mine.RecipeExchangeHub.Service.CreateService;
import com.mine.RecipeExchangeHub.model.CreateRecipe;

import com.mine.RecipeExchangeHub.repository.CreateRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import java.util.List;


@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/recipe")
public class CreateController {
    @Autowired
    private CreateService createService;
    @Autowired
    private CreateRepository createRepository;



    @PostMapping("/saveRecipe")
    public String saveRecipe(@RequestBody CreateRecipe createRecipe){
        createService.saveRecipes(createRecipe);
        return "new Recipe added!";
    }
    @GetMapping("/getRecipes")
    public List<CreateRecipe> getRecipes(){
        return createService.getAllRecipes();
    }

}
