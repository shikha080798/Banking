package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService{

@Autowired
    AccountRepository accountRepository;
    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }
}
