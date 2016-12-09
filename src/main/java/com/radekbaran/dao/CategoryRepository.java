package com.radekbaran.dao;

import com.radekbaran.model.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1,"Osoby"),
            new Category(2,"Sport"),
            new Category(3,"Memy")
    );

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }
    public Category findById(int id){
        for (Category category:ALL_CATEGORIES){
            if (category.getId()==id){
                return category;
            }
        }
        return null;
    }

    public Category getName(){
        Category categoryName;
        for(Category c : ALL_CATEGORIES){
            c.getName();
            
        }
        return categoryName;
    }

}