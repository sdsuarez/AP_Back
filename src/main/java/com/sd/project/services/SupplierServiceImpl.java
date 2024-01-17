package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.ShipmentItem;
import com.sd.project.entity.Supplier;
import com.sd.project.repository.SupplierRepository;

public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    @Override
    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier findByIdSupplier(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    @Override
    public List<Supplier> findAllSupplier() {
        return supplierRepository.findAll();
    }

    @Override
    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}
