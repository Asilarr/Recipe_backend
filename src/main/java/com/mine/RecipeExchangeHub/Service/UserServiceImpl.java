package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.User;
import com.mine.RecipeExchangeHub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }
    @Override
    public User getUserById(Long user_id){
        return userRepository.findById(user_id).orElse(null);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
