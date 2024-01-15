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
@Table(name = "Defect")
public class Defect {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idDefect;

    private String  description;
    private Date identifiedDate;
    @ManyToOne()
    @JoinColumn(name = "statusId")
    Status status;
    public Defect(String description, Date identifiedDate) {
        this.description = description;
        this.identifiedDate = identifiedDate;
    }
    public long getIdDefect() {
        return idDefect;
    }
    public void setIdDefect(long idDefect) {
        this.idDefect = idDefect;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getIdentifiedDate() {
        return identifiedDate;
    }
    public void setIdentifiedDate(Date identifiedDate) {
        this.identifiedDate = identifiedDate;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
