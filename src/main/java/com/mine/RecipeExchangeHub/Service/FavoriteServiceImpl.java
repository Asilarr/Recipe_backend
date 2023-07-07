package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.Favorite;
import com.mine.RecipeExchangeHub.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService{
    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public Favorite saveFavorite(Favorite favorite){
        return favoriteRepository.save(favorite);
    }

    @Override
    public List<Favorite> getAllFavorites(){
        return favoriteRepository.findAll();
    }
}
