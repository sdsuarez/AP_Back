package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.project.entity.Area;




@Repository
public interface AreaRepository extends JpaRepository<Area, Long>{
    
}
