package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.project.entity.Warehouse;


@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long>{
    
}
