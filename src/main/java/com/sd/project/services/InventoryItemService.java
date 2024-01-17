package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.InventoryItem;



public interface InventoryItemService {
    public InventoryItem save(InventoryItem inventoryItem);
    public InventoryItem findByIdInventoryItem(Long id);
    public List<InventoryItem> findAllInventoryItem();
    public void deleteInventoryItem(Long id);
}
