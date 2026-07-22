package com.platzi.pizza.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.platzi.pizza.persistence.entity.OrderItem;

public interface OrderItemRepository extends ListCrudRepository<OrderItem, Integer>{

}
