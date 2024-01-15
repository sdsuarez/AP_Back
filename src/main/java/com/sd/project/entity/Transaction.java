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
@Table(name="Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTransaction;
    private String type;
    private BigDecimal amount;
    private Date date;
    private String referenceNumber;
    private String description;
    @ManyToOne()
    @JoinColumn(name = "AccountId")
    Account account;
    public Transaction(long idTransaction, String type, BigDecimal amount, Date date, String referenceNumber,
            String description) {
        this.idTransaction = idTransaction;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.referenceNumber = referenceNumber;
        this.description = description;
    }
    public Transaction(){

    }
    public long getIdTransaction() {
        return idTransaction;
    }
    public void setIdTransaction(long idTransaction) {
        this.idTransaction = idTransaction;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getReferenceNumber() {
        return referenceNumber;
    }
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    
    
    
}
