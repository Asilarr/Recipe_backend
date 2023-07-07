package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    User getUserById(Long user_id);
    List<User> getAllUsers();
}
