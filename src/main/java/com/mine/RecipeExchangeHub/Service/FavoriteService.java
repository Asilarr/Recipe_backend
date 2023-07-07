package com.mine.RecipeExchangeHub.Service;

import com.mine.RecipeExchangeHub.model.Favorite;

import java.util.List;

public interface FavoriteService {
    public Favorite saveFavorite(Favorite favorite);

    List<Favorite> getAllFavorites();

}
