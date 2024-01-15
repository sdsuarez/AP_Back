package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sd.project.entity.Shipment;



@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long>{
    
}
