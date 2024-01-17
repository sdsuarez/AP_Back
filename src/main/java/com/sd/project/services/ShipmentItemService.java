 package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.ShipmentItem;



public interface ShipmentItemService {

    public ShipmentItem save(ShipmentItem shipmentItem);
    public ShipmentItem findByIdShipmentItem(Long id);
    public List<ShipmentItem> findAllShipmentItem();
    public void deleteShipmentItem(Long id);
}
