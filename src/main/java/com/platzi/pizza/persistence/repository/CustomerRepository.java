package com.platzi.pizza.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.platzi.pizza.persistence.entity.Customer;

public interface CustomerRepository extends ListCrudRepository<Customer, Integer>{
    
}
