package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.ProviderTransaction;



public interface ProviderTransactionService {
    public ProviderTransaction save(ProviderTransaction providerTransaction);
    public ProviderTransaction findByIdProviderTransaction(Long id);
    public List<ProviderTransaction> findAllProviderTransaction();
    public void deleteProviderTransaction(Long id);
}
