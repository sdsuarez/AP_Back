package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sd.project.entity.Defect;




@Repository
public interface DefectRepository extends JpaRepository<Defect, Long>{
    
}
