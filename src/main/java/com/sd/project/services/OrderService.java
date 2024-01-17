package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Order;



public interface OrderService {
    public Order save(Order order);
    public Order findByIdOrder(Long id);
    public List<Order> findAllOrder();
    public void deleteOrder(Long id);
}
