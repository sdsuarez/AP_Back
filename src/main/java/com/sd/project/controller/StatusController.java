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

import com.sd.project.entity.Status;
import com.sd.project.repository.StatusRepository;

@RestController
@RequestMapping("/status")
public class StatusController {
    Logger log = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private StatusRepository statusRepository;

    @GetMapping("/{id}")
     public ResponseEntity<Status> findStatus(@PathVariable Long id) {
        try {
            Status status = statusRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Status not found"));
            return ResponseEntity.ok(status);
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @GetMapping("/list")
    
    public ResponseEntity<List<Status>> listStatuses() {
        try {
            List<Status> statuses = statusRepository.findAll();
            return ResponseEntity.ok(statuses);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/create")
    
    public ResponseEntity<Status> createStatus(@RequestBody Status newStatus) {
        try {
            Status createdStatus = statusRepository.save(newStatus);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdStatus);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @DeleteMapping("/delete/{id}")
    
    public ResponseEntity<Void> deleteStatus(@PathVariable Long id) {
        try {
            statusRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveStatus(@ModelAttribute Status Status, Model model) {
        try {
            statusRepository.save(Status);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @PutMapping("/update/{id}")
    
    public ResponseEntity<String> update(@PathVariable Long id, Model model) {
        try {
            Status status = statusRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Status not found"));
            model.addAttribute("status", status);
            return ResponseEntity.ok("Status/update");
        } catch (ResponseStatusException ex) {
            throw ex; // Excepción ya manejada, se relanza
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }
    
}
