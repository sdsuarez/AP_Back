package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.ShipmentItem;
import com.sd.project.repository.ShipmentItemRepository;

public class ShipmentItemServiceImpl implements ShipmentItemService {

    @Autowired
    ShipmentItemRepository shipmentItemRepository;
    @Override
    public ShipmentItem save(ShipmentItem shipmentItem) {
        return shipmentItemRepository.save(shipmentItem);
    }

    @Override
    public ShipmentItem findByIdShipmentItem(Long id) {
        return shipmentItemRepository.findById(id).orElse(null);
    }

    @Override
    public List<ShipmentItem> findAllShipmentItem() {
        return shipmentItemRepository.findAll();
    }

    @Override
    public void deleteShipmentItem(Long id) {
        shipmentItemRepository.deleteById(id);
    }
    
}
