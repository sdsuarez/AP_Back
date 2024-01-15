package com.sd.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Warehose")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idWarehouse;
    private String name;
    private String location;

    public Warehouse(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public Warehouse(){

    }
    public long getIdWarehouse() {
        return idWarehouse;
    }
    public void setIdWarehouse(long idWarehouse) {
        this.idWarehouse = idWarehouse;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    
    
}
