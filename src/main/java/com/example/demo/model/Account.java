package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Positive;

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 20)
    private int id;
    @Column(length = 20)
    private String name;
    @Column(length = 20)
    private long accountno;
    @Column(length = 20)
    @Positive
    private double balance;
    //Args Constructor
    public Account(int id, String name, long accountno, double balance) {
        this.id = id;
        this.name = name;
        this.accountno = accountno;
        this.balance = balance;
    }
    //No-Args Constructor
    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountno() {
        return accountno;
    }

    public void setAccountno(long accountno) {
        this.accountno = accountno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountno=" + accountno +
                ", balance=" + balance +
                '}';
    }
}
