package com.platzi.pizza.persistence.dto;

import com.platzi.pizza.persistence.entity.Order;
import com.platzi.pizza.persistence.entity.OrderEntity;

public class OrderDto {

    public Order entityToModel(OrderEntity orderEntity){

        Order order = new Order();

        order.setIdOrder(orderEntity.getIdOrder());
        order.setIdItem(orderEntity.getIdItem());
        order.setIdPizza(orderEntity.getIdPizza());
        order.setQuantify(orderEntity.getQuantify());
        order.setPrice(orderEntity.getPrice());

        return order;
    }

    public OrderEntity modelToEntity(Order order){
        
        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setIdOrder(order.getIdOrder());
        orderEntity.setIdItem(order.getIdItem());
        orderEntity.setIdPizza(order.getIdPizza());
        orderEntity.setQuantify(order.getQuantify());
        orderEntity.setPrice(order.getPrice());

        return orderEntity;
    }




}

