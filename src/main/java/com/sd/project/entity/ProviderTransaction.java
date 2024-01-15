package com.sd.project.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.repository.cdi.Eager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProviderTransaction")
public class ProviderTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProviderTransaction;
    private String type;
    private BigDecimal amount;
    private Date date;
    private String referenceNumber;
    private String description;
    @ManyToOne()
    @JoinColumn(name = "SupplierId")
    Supplier supplier;
    public ProviderTransaction(String type, BigDecimal amount, Date date, String referenceNumber, String description) {
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.referenceNumber = referenceNumber;
        this.description = description;
    }
    public ProviderTransaction(){

    }
    public long getIdProviderTransaction() {
        return idProviderTransaction;
    }
    public void setIdProviderTransaction(long idProviderTransaction) {
        this.idProviderTransaction = idProviderTransaction;
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
    public Supplier getSupplier() {
        return supplier;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    

}
