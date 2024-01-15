package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sd.project.entity.QualityTest;

public interface QualityTestRepository extends  JpaRepository<QualityTest, Long>{
    
}
