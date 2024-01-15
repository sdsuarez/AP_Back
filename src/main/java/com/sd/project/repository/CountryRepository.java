package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.project.entity.Country;



@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{
    
}
