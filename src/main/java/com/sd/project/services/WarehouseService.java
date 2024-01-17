package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Warehouse;


public interface WarehouseService {
    

    public Warehouse save(Warehouse warehouse);
    public Warehouse findByIdWarehouse(Long id);
    public List<Warehouse> findAllWarehouse();
    public void deleteWarehouse(Long id);
}

