package com.platzi.pizza.persistence.dto;

import com.platzi.pizza.persistence.entity.OrderItem;
import com.platzi.pizza.persistence.entity.OrderItemEntity;

public class OrderItemDto {

    public OrderItem entityToModel(OrderItemEntity orderItemEntity){
        
        OrderItem orderItem = new OrderItem();

        orderItem.setIdOrder(orderItemEntity.getIdOrder());
        orderItem.setIdItem(orderItemEntity.getIdItem());
        orderItem.setIdPizza(orderItemEntity.getIdPizza());
        orderItem.setQuantify(orderItemEntity.getQuantity());
        orderItem.setPrice(orderItemEntity.getPrice());

        return orderItem;
    }

    public OrderItemEntity modelToEntity(OrderItem orderItem){

        OrderItemEntity orderItemEntity = new OrderItemEntity();

        orderItemEntity.setIdOrder(orderItem.getIdOrder());
        orderItemEntity.setIdItem(orderItem.getIdItem());
        orderItemEntity.setIdPizza(orderItem.getIdPizza());
        orderItemEntity.setQuantity(orderItem.getQuantify());
        orderItemEntity.setPrice(orderItem.getPrice());

        return orderItemEntity;
    }
    
}
