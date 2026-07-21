package com.platzi.pizza.persistence.repository;


import com.platzi.pizza.persistence.entity.Pizza;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<Pizza,Integer> {

}
