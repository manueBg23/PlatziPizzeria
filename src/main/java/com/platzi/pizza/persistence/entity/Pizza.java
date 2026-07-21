package com.platzi.pizza.persistence.entity;

public class Pizza {

    private Integer idPizza;
    private String name;
    private String description;
    private Double price;
    private Boolean vegetarian;
    private Boolean vegan;
    private Boolean available;

    public Integer getIdPizza(){
        return idPizza;
    }
    public void setIdPizza(Integer idPizza){
        this.idPizza = idPizza;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    public Boolean getVegeterian(){
        return vegetarian;
    }
    public void setVegetarian(Boolean vegetarian){
        this.vegetarian = vegetarian;
    }

    public Boolean getVegan(){
        return vegan;
    }
    public void setVegan(Boolean vegan){
        this.vegan = vegan;
    }

    public Boolean getAvailable(){
        return available;
    }
    public void setAvailable(Boolean available){
        this.available = available;
    }
}
