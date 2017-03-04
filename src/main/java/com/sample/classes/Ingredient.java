package com.sample.sparkdemo.classes;
public class Ingredient{
    String name;
    int quantity;

    public Ingredient(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setQuantity(int q){
        this.quantity = q;
    }
    public int getQuantity(){
        return quantity;
    }
}