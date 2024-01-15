package com.sd.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ShipmentItem")
public class ShipmentItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idShipmentItem;

    @ManyToOne()
    @JoinColumn(name = "ShipmnentItemId")
    ShipmentItem shipmentItem;
    @ManyToOne()
    @JoinColumn(name = "ProductId")
    Product product;

    private Integer quantity;

    public ShipmentItem(Integer quantity) {
        this.quantity = quantity;
    }

    public ShipmentItem(){

    }

    public long getIdShipmentItem() {
        return idShipmentItem;
    }

    public void setIdShipmentItem(long idShipmentItem) {
        this.idShipmentItem = idShipmentItem;
    }

    public ShipmentItem getShipmentItem() {
        return shipmentItem;
    }

    public void setShipmentItem(ShipmentItem shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    
}
