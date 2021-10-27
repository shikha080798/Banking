package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AccountController {
    @Autowired
    AccountServiceImpl accountServiceimpl;

    @PostMapping("/addAccount")
    public ResponseEntity<?> saveAccount(@RequestBody Account account)  {
        Account account1 = accountServiceimpl.addAccount(account);
        return new ResponseEntity<Account>(account1,  HttpStatus.CREATED);
    }
    }
