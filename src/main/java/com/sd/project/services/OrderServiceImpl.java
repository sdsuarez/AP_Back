package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.Order;
import com.sd.project.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;
    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findByIdOrder(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
    
}
