package com.sd.project.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idAccount;
    private String name;
    private BigDecimal balance;
    private String typeAccount;
    private Date oppeningDate;
    private String state;
    @ManyToOne()
    @JoinColumn(name = "CustomerId")
    Customer customer;
    public Account(String name, BigDecimal balance, String typeAccount, Date oppeningDate, String state) {
        this.name = name;
        this.balance = balance;
        this.typeAccount = typeAccount;
        this.oppeningDate = oppeningDate;
        this.state = state;
    }
    public Account(){

    }
    public long getIdAccount() {
        return idAccount;
    }
    public void setIdAccount(long idAccount) {
        this.idAccount = idAccount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public String getTypeAccount() {
        return typeAccount;
    }
    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }
    public Date getOppeningDate() {
        return oppeningDate;
    }
    public void setOppeningDate(Date oppeningDate) {
        this.oppeningDate = oppeningDate;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
