package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Transaction;

public interface TransactionService {
  
    public Transaction save(Transaction transaction);
    public Transaction findByIdTransaction(Long id);
    public List<Transaction> findAllTransaction();
    public void deleteTransaction(Long id);
}

