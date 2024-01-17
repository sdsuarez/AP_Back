package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.Warehouse;
import com.sd.project.repository.WarehouseRepository;

public class WarehouseServiceImpl implements WarehouseService{

    @Autowired
    WarehouseRepository warehouseRepository;
    @Override
    public Warehouse save(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    @Override
    public Warehouse findByIdWarehouse(Long id) {
        return warehouseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Warehouse> findAllWarehouse() {
        return warehouseRepository.findAll();
    }

    @Override
    public void deleteWarehouse(Long id) {
        warehouseRepository.deleteById(id);
    }
    
}
