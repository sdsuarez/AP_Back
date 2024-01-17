package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.Shipment;
import com.sd.project.repository.ShipmentRepository;

public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    ShipmentRepository shipmentRepository;
    @Override
    public Shipment save(Shipment shipment) {
        return shipmentRepository.save(shipment);
        
    }

    @Override
    public Shipment findByIdShipment(Long id) {
        return shipmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Shipment> findAllShipment() {
        return shipmentRepository.findAll();
    }

    @Override
    public void deleteShipment(Long id) {
        shipmentRepository.deleteById(id);
    }
    
}
