package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sd.project.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
