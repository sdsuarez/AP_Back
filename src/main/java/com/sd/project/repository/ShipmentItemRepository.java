package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.sd.project.entity.ShipmentItem;



@Repository
public interface ShipmentItemRepository extends JpaRepository<ShipmentItem, Long>{
    
}
