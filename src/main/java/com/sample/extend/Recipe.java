package com.sample.sparkdemo.extend;

import java.util.*;

public class Recipe{
    String name;
    public List<Ingredient> ingredients = new ArrayList<>();   

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public List<Ingredient> getIngredients(){
        return this.ingredients;
    }
}