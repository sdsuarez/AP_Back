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

import com.sd.project.entity.ShipmentItem;
import com.sd.project.repository.ShipmentItemRepository;

@RestController
@RequestMapping("/shipmentItem")
public class ShipmentItemController {
    Logger log =LoggerFactory.getLogger(getClass());
    
    @Autowired
    private ShipmentItemRepository shipmentItemRepository;

    @GetMapping("/{id}")
     public ResponseEntity<ShipmentItem> findShipmentItem(@PathVariable Long id) {
        try {
            ShipmentItem shipmentItem = shipmentItemRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentItem not fund"));
            return ResponseEntity.ok(shipmentItem);
        }catch(ResponseStatusException ex){
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }
    @GetMapping("/list")
    
    public ResponseEntity<List<ShipmentItem>> listshipmentItems() {
        try {
            List<ShipmentItem> shipmentItems = shipmentItemRepository.findAll();
            return ResponseEntity.ok(shipmentItems);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/create")
    
    public ResponseEntity<ShipmentItem> createShipmentItem(@RequestBody ShipmentItem newShipmentItem) {
        try {
            ShipmentItem createdShipmentItem = shipmentItemRepository.save(newShipmentItem);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdShipmentItem);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @DeleteMapping("/delete/{id}")
    
    public ResponseEntity<Void> deleteShipmentItem(@PathVariable Long id) {
        try {
            shipmentItemRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveShipmentItem(@ModelAttribute ShipmentItem ShipmentItem, Model model) {
        try {
            shipmentItemRepository.save(ShipmentItem);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PutMapping("/update/{id}")
    
    public ResponseEntity<String> update(@PathVariable Long id, Model model) {
        try {
            ShipmentItem ShipmentItem = shipmentItemRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentItem not found"));
            model.addAttribute("ShipmentItem", ShipmentItem);
            return ResponseEntity.ok("ShipmentItem/update");
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }


}

