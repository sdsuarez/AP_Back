package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sd.project.entity.Status;


@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{
    
}
