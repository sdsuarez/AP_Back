package com.sd.project.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "InventoryItem")
public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInventory;
    
    private Integer quantity;
    private Date lastReplenishmentDate;
    private Date expiryDate;

    @ManyToOne()
    @JoinColumn(name = "productId")
    Product product;
    @ManyToOne()
    @JoinColumn(name = "warehouseId")
    Warehouse Warehose;

    public InventoryItem(Integer quantity, Date lastReplenishmentDate, Date expiryDate) {
        this.quantity = quantity;
        this.lastReplenishmentDate = lastReplenishmentDate;
        this.expiryDate = expiryDate;
    }
    public InventoryItem(){

    }
    public Long getIdInventory() {
        return idInventory;
    }
    public void setIdInventory(Long idInventory) {
        this.idInventory = idInventory;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Date getLastReplenishmentDate() {
        return lastReplenishmentDate;
    }
    public void setLastReplenishmentDate(Date lastReplenishmentDate) {
        this.lastReplenishmentDate = lastReplenishmentDate;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Warehouse getWarehose() {
        return Warehose;
    }
    public void setWarehose(Warehouse warehose) {
        Warehose = warehose;
    }
    

    
    
}
