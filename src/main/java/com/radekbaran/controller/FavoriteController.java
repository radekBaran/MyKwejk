package com.radekbaran.controller;

import com.radekbaran.dao.FavoriteRepository;
import com.radekbaran.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavoriteController {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @RequestMapping("/favorites")
    public String favorite(ModelMap modelMap) {
        List<Gif> gifs = favoriteRepository.findFavorite();
        modelMap.put("gifs", gifs);
        return "favorites";
    }
}
