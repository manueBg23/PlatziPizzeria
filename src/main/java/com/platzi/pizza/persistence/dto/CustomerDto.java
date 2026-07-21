package com.platzi.pizza.persistence.dto;

import com.platzi.pizza.persistence.entity.Customer;
import com.platzi.pizza.persistence.entity.CustomerEntity;

public class CustomerDto {

    public Customer entityToModel(CustomerEntity customerEntity){

        Customer customer = new Customer();

        customer.setIdCustomer(customerEntity.getIdCustomer());
        customer.setName(customerEntity.getName());
        customer.setAddress(customer.getAddress());
        customer.setEmail(customerEntity.getEmail());
        customer.setPhoneNumber(customerEntity.getPhoneNumber());

        return customer;
    }

    public CustomerEntity modelToEntity(Customer customer){
        
        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setIdCustomer(customer.getIdCustomer());
        customerEntity.setName(customer.getName());
        customerEntity.setAddress(customer.getAddress());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setPhoneNumber(customer.getPhoneNumber());

        return customerEntity;
    }
    
}
