package com.radekbaran.dao;

import com.radekbaran.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FavoriteRepository {

    public List<Gif> findFavorite() {
        List<Gif> favouritesGifs = new ArrayList<>();
        for(Gif gif : GifRepository.ALL_GIFS){
            if(gif.isFavorite()){
                favouritesGifs.add(gif);
            }
        }
        return favouritesGifs;
    }
}
