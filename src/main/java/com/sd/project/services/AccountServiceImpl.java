package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.project.entity.Account;
import com.sd.project.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account findByIdAccount(long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public List<Account> findAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public void deleteAccount(long id) {
         accountRepository.deleteById(id);
    }
    
}
