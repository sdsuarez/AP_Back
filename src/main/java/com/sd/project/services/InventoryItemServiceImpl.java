package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.InventoryItem;
import com.sd.project.repository.InventoryItemRepository;

public class InventoryItemServiceImpl implements InventoryItemService{

    @Autowired
    InventoryItemRepository inventoryItemRepository;
    @Override
    public InventoryItem save(InventoryItem inventoryItem) {
       return inventoryItemRepository.save(inventoryItem);
    }

    @Override
    public InventoryItem findByIdInventoryItem(Long id) {
        return inventoryItemRepository.findById(id).orElse(null);
    }

    @Override
    public List<InventoryItem> findAllInventoryItem() {
        return inventoryItemRepository.findAll();
    }

    @Override
    public void deleteInventoryItem(Long id) {
        inventoryItemRepository.deleteById(id);
    }
    
}
