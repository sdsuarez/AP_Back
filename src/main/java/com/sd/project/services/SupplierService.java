package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Supplier;
import com.sd.project.entity.Supplier;

public interface SupplierService {

    public Supplier save(Supplier supplier);
    public Supplier findByIdSupplier(Long id);
    public List<Supplier> findAllSupplier();
    public void deleteSupplier(Long id);
}

