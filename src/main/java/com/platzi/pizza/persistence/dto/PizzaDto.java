package com.platzi.pizza.persistence.dto;

import com.platzi.pizza.persistence.entity.Pizza;
import com.platzi.pizza.persistence.entity.PizzaEntity;

public class PizzaDto {
    
    public Pizza entityToModel(PizzaEntity pizzaEntity){

        Pizza pizza = new Pizza();

        pizza.setIdPizza(pizzaEntity.getIdPizza());
        pizza.setName(pizzaEntity.getName());
        pizza.setDescription(pizzaEntity.getDescription());
        pizza.setPrice(pizzaEntity.getPrice());
        pizza.setVegetarian(pizzaEntity.getVegetarian());
        pizza.setVegan(pizzaEntity.getVegan());
        pizza.setAvailable(pizzaEntity.getAvailable());

        return pizza;
    }

    public PizzaEntity modelToEntity(Pizza pizza){

        PizzaEntity pizzaEntity = new PizzaEntity();

        pizzaEntity.setIdPizza(pizza.getIdPizza());
        pizzaEntity.setName(pizza.getName());
        pizzaEntity.setDescription(pizza.getDescription());
        pizzaEntity.setPrice(pizza.getPrice());
        pizzaEntity.setVegetarian(pizza.getVegeterian());
        pizzaEntity.setVegan(pizza.getVegan());
        pizzaEntity.setAvailable(pizza.getAvailable());

        return pizzaEntity;
    }


}
