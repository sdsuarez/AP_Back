package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.project.entity.InventoryItem;


@Repository
public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long>{
    
}
