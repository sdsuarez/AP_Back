package com.sd.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Area")
public class Area {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idArea;
    private String description;

    public Area(String description) {
        this.description = description;
    }
    public Area(){
        
    }

    public long getIdArea() {
        return idArea;
    }

    public void setIdArea(long idArea) {
        this.idArea = idArea;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
