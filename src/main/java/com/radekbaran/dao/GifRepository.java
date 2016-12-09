package com.radekbaran.dao;

import com.radekbaran.model.Category;
import com.radekbaran.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    public static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "Chris Ramacciotti", false,  new Category(3,"Memy")),
            new Gif("ben-and-mike", "Ben Jakuben", true, new Category(1,"Osoby")),
            new Gif("book-dominos", "Craig Dennis", false, new Category(2,"Sport")),
            new Gif("compiler-bot", "Ada Lovelace", true,  new Category(3,"Memy")),
            new Gif("cowboy-coder", "Grace Hopper", false, new Category(1,"Osoby")),
            new Gif("infinite-andrew", "Marissa Mayer", true, new Category(1,"Osoby"))
    );
    public Gif findByName(String name){
        for (Gif gif : ALL_GIFS){
            if ( gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id) {
        List<Gif> categoryGifs = new ArrayList<>();
        for(Gif gif : GifRepository.ALL_GIFS){
            if(gif.getCategory().getId() == id){
                categoryGifs.add(gif);
            }
        }
        return categoryGifs;
    }

    public List<Gif> searchByCategoryName(String name){
        List<Gif> searchGifs = new ArrayList<>();
        for(Gif g : GifRepository.ALL_GIFS){
            if(g.getCategory().getName().equals(name)){
                searchGifs.add(g);
            }
        }
        return searchGifs;
    }
}
