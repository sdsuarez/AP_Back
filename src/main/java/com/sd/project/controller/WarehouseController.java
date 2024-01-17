package com.sd.project.controller;


import java.lang.module.ResolutionException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sd.project.entity.Warehouse;
import com.sd.project.repository.WarehouseRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
    Logger log = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private WarehouseRepository warehouseRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Warehouse> findWarehouse(@PathVariable Long id) {
        try{
            Warehouse warehouse = warehouseRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Warehouse not found"));
                return ResponseEntity.ok(warehouse);
        }catch(ResponseStatusException ex){
            throw ex;
        }catch(Exception ex){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Internal Server Error",ex);
        }
    }

    @GetMapping("/list")
    
    public ResponseEntity<List<Warehouse>> listWarehouses() {
        try {
            List<Warehouse> warehouses = warehouseRepository.findAll();
            return ResponseEntity.ok(warehouses);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/create")
    
    public ResponseEntity<Warehouse> createWarehouse(@RequestBody Warehouse newWarehouse) {
        try {
            Warehouse createdWarehouse = warehouseRepository.save(newWarehouse);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdWarehouse);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @DeleteMapping("/delete/{id}")
    
    public ResponseEntity<Void> deleteWarehouse(@PathVariable Long id) {
        try {
            warehouseRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveWarehouse(@ModelAttribute Warehouse Warehouse, Model model) {
        try {
            warehouseRepository.save(Warehouse);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PutMapping("/update/{id}")
    
    public ResponseEntity<String> update(@PathVariable Long id, Model model) {
        try {
            Warehouse Warehouse = warehouseRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Warehouse not found"));
            model.addAttribute("warehouse", Warehouse);
            return ResponseEntity.ok("warehouse/update");
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }
    
}
