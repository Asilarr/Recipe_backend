package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.CreateRecipe;
import com.mine.RecipeExchangeHub.repository.CreateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateServiceImpl implements CreateService {
    @Autowired
    private CreateRepository createRepository;
    @Override
    public CreateRecipe saveRecipes(CreateRecipe createRecipe){
    return createRepository.save(createRecipe);
    }

    @Override
    public List<CreateRecipe> getAllRecipes(){
        return createRepository.findAll();
    }
}
