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

import com.sd.project.entity.Shipment;
import com.sd.project.repository.ShipmentRepository;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {
    Logger log =LoggerFactory.getLogger(getClass());
    
    @Autowired
    private ShipmentRepository shipmentRepository;

    @GetMapping("/{id}")
     public ResponseEntity<Shipment> findShipment(@PathVariable Long id) {
        try {
            Shipment shipment = shipmentRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment not fund"));
            return ResponseEntity.ok(shipment);
        }catch(ResponseStatusException ex){
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }
    @GetMapping("/list")
    
    public ResponseEntity<List<Shipment>> listshipments() {
        try {
            List<Shipment> shipments = shipmentRepository.findAll();
            return ResponseEntity.ok(shipments);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/create")
    
    public ResponseEntity<Shipment> createShipment(@RequestBody Shipment newShipment) {
        try {
            Shipment createdShipment = shipmentRepository.save(newShipment);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdShipment);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @DeleteMapping("/delete/{id}")
    
    public ResponseEntity<Void> deleteShipment(@PathVariable Long id) {
        try {
            shipmentRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveShipment(@ModelAttribute Shipment Shipment, Model model) {
        try {
            shipmentRepository.save(Shipment);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PutMapping("/update/{id}")
    
    public ResponseEntity<String> update(@PathVariable Long id, Model model) {
        try {
            Shipment Shipment = shipmentRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment not found"));
            model.addAttribute("Shipment", Shipment);
            return ResponseEntity.ok("Shipment/update");
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }


}

