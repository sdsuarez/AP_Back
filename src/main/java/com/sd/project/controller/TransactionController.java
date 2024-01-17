package com.sd.project.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sd.project.entity.Transaction;
import com.sd.project.repository.TransactionRepository;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/{id}")
    
    public ResponseEntity<Transaction> findTransaction(@PathVariable Long id) {
        try {
            Transaction transaction = transactionRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Transaction not found"));
            return ResponseEntity.ok(transaction);
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @GetMapping("/list")
    
    public ResponseEntity<List<Transaction>> listtransactions() {
        try {
            List<Transaction> transactions = transactionRepository.findAll();
            return ResponseEntity.ok(transactions);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/create")
    
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction newTransaction) {
        try {
            Transaction createdTransaction = transactionRepository.save(newTransaction);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdTransaction);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @DeleteMapping("/delete/{id}")
    
    public ResponseEntity<Void> deleteTransaction(@PathVariable Long id) {
        try {
            transactionRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveTransaction(@ModelAttribute Transaction transaction, Model model) {
        try {
            transactionRepository.save(transaction);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PutMapping("/update/{id}")
    
    public ResponseEntity<String> update(@PathVariable Long id, Model model) {
        try {
            Transaction transaction = transactionRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Transaction not found"));
            model.addAttribute("Transaction", transaction);
            return ResponseEntity.ok("Transaction/update");
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }
    
    
}
