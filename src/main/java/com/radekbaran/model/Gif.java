package com.radekbaran.model;

import org.springframework.stereotype.Component;

@Component
public class Gif {
    private String name;
    private String username;
    private boolean favorite;

    private Category category;

    public Gif() {
    }

    public Gif(String name, String username, boolean favorite, Category category) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
