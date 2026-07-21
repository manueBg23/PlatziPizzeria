package com.platzi.pizza.service;

import com.platzi.pizza.persistence.entity.Pizza;
import com.platzi.pizza.persistence.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> getAll(){
        return this.pizzaRepository.findAll();
    }

    public Pizza get(int idPizza){
        return this.pizzaRepository.findById(idPizza).orElse(null);
    }

    public Pizza save(Pizza pizza){
        return pizzaRepository.save(pizza);
    }

    public Pizza update(int idPizza, Pizza pizza){

        Pizza pizzaActual = this.get(idPizza);

        if(pizzaActual == null){
            return null;
        }

        pizza.setIdPizza(idPizza);

        return this.pizzaRepository.save(pizza);
    }

    public void delete(int idPizza){
        this.pizzaRepository.deleteById(idPizza);
    }

}









