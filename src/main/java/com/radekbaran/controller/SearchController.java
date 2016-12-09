package com.radekbaran.controller;

import com.radekbaran.dao.CategoryRepository;
import com.radekbaran.dao.GifRepository;
import com.radekbaran.model.Category;
import com.radekbaran.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    GifRepository gifRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/search")
    public String searchByName(@RequestParam(value = "q", required = false, defaultValue = "1") String name,
                               ModelMap modelMap){
        Category searchCategoryName = (Category) categoryRepository.getName();
        modelMap.put("category", searchCategoryName);
        List<Gif> categories = gifRepository.searchByCategoryName(name);
        modelMap.put("gif", categories);
        return "category";
    }
}
