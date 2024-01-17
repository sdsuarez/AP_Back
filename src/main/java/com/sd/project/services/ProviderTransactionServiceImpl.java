package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.ProviderTransaction;
import com.sd.project.repository.ProviderTransactionRepository;

public class ProviderTransactionServiceImpl implements ProviderTransactionService  {


    @Autowired
    ProviderTransactionRepository providerTransactionRepository;
    @Override
    public ProviderTransaction save(ProviderTransaction providerTransaction) {
        return providerTransactionRepository.save(providerTransaction);
    }

    @Override
    public ProviderTransaction findByIdProviderTransaction(Long id) {
        return providerTransactionRepository.findById(id).orElse(null);
    }

    @Override
    public List<ProviderTransaction> findAllProviderTransaction() {
        return providerTransactionRepository.findAll();
    }

    @Override
    public void deleteProviderTransaction(Long id) {
        providerTransactionRepository.deleteById(id);
    }
    
}
