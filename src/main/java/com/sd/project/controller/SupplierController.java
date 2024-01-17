package com.sd.project.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sd.project.entity.Supplier;
import com.sd.project.repository.SupplierRepository;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    SupplierRepository supplierRepository;

    @GetMapping("/{id}")
     public ResponseEntity<Supplier> findSupplier(@PathVariable Long id) {
        try {
            Supplier supplier = supplierRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Supplier not found"));
            return ResponseEntity.ok(supplier);
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @GetMapping("/list")
    
    public ResponseEntity<List<Supplier>> listsuppliers() {
        try {
            List<Supplier> suppliers = supplierRepository.findAll();
            return ResponseEntity.ok(suppliers);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/create")
    
    public ResponseEntity<Supplier> createSupplier(@RequestBody Supplier newSupplier) {
        try {
            Supplier createdSupplier = supplierRepository.save(newSupplier);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdSupplier);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @DeleteMapping("/delete/{id}")
    
    public ResponseEntity<Void> deleteSupplier(@PathVariable Long id) {
        try {
            supplierRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveSupplier(@ModelAttribute Supplier supplier, Model model) {
        try {
            supplierRepository.save(supplier);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PutMapping("/update/{id}")
    
    public ResponseEntity<String> update(@PathVariable Long id, Model model) {
        try {
            Supplier supplier = supplierRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Supplier not found"));
            model.addAttribute("Supplier", supplier);
            return ResponseEntity.ok("Supplier/update");
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }
}
