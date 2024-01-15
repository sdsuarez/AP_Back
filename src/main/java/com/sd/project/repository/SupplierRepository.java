package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.sd.project.entity.Supplier;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{
    
}
