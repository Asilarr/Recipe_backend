package com.mine.RecipeExchangeHub.controller;

import com.mine.RecipeExchangeHub.Service.UserService;

import com.mine.RecipeExchangeHub.model.User;
import com.mine.RecipeExchangeHub.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New recipe added!";

    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

}
