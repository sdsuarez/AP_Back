package com.sd.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sd.project.entity.ProviderTransaction;


@Repository
public interface ProviderTransactionRepository extends JpaRepository<ProviderTransaction, Long>{
    
}
