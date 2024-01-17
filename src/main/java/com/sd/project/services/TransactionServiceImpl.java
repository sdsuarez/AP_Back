package com.sd.project.services;

import java.util.List;

import org.apache.naming.TransactionRef;
import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.Transaction;
import com.sd.project.repository.TransactionRepository;

public class TransactionServiceImpl implements TransactionService {


    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public Transaction save(Transaction transaction) {
        return  transactionRepository.save(transaction);
    }

    @Override
    public Transaction findByIdTransaction(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Transaction> findAllTransaction() {
        return transactionRepository.findAll();
    }

    @Override
    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}
