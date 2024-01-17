package com.sd.project.services;

import java.util.List;
import com.sd.project.entity.Account;

public interface AccountService {
    public Account save(Account account);
    public Account findByIdAccount(long id);
    public List<Account> findAllAccount();
    public void deleteAccount(long id);
}
