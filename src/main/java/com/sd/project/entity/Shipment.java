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
@Table(name = "Shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idShipment;
    @ManyToOne()
    @JoinColumn(name = "OriginId")
    City cityOrigin;
    @ManyToOne()
    @JoinColumn(name = "DestinationId")
    City cityDestination;
    private Date departureDate;
    private Date arrivalDate;
    private String transportMode;
    private BigDecimal cost;
    
    public Shipment(Date departureDate, Date arrivalDate, String transportMode, BigDecimal cost) {
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.transportMode = transportMode;
        this.cost = cost;
    }
    public Shipment(){
        
    }
    public long getIdShipment() {
        return idShipment;
    }
    public void setIdShipment(long idShipment) {
        this.idShipment = idShipment;
    }
    public City getCityOrigin() {
        return cityOrigin;
    }
    public void setCityOrigin(City cityOrigin) {
        this.cityOrigin = cityOrigin;
    }
    public City getCityDestination() {
        return cityDestination;
    }
    public void setCityDestination(City cityDestination) {
        this.cityDestination = cityDestination;
    }
    public Date getDepartureDate() {
        return departureDate;
    }
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
    public Date getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public String getTransportMode() {
        return transportMode;
    }
    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }
    public BigDecimal getCost() {
        return cost;
    }
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
    
}
