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
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmployee;
    private String name;
    private String position;
    private Date hiringDate;
    @ManyToOne()
    @JoinColumn(name = "areaId")
    Area area;
    public Employee(String name, String position, Date hiringDate) {
        this.name = name;
        this.position = position;
        this.hiringDate = hiringDate;
    }
    public Employee(){

    }
    public long getIdEmployee() {
        return idEmployee;
    }
    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public Date getHiringDate() {
        return hiringDate;
    }
    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }
    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }
    
}
