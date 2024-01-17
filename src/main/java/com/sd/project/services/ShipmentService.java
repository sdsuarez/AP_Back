package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Shipment;

public interface ShipmentService {

    public Shipment save(Shipment shipment);
    public Shipment findByIdShipment(Long id);
    public List<Shipment> findAllShipment();
    public void deleteShipment(Long id);
}
