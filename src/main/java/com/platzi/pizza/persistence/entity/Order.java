package com.platzi.pizza.persistence.entity;

public class Order {

    private Integer idOrder;
    private Integer idItem;
    private Integer idPizza;
    private Double quantify;
    private Double price;
    
    public Integer getIdOrder(){
        return idOrder;
    }
    public void setIdOrder(Integer idOrder){
        this.idOrder = idOrder;
    }

    public Integer getIdItem(){
        return idItem;
    }
    public void setIdItem(Integer idItem){
        this.idItem = idItem;
    }

    public Integer getIdPizza(){
        return idPizza;
    }
    public void setIdPizza(Integer idPizza){
        this.idPizza = idPizza;
    }

    public Double getQuantify(){
        return quantify;
    }
    public void setQuantify(Double quantify){
        this.quantify = quantify;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

}
