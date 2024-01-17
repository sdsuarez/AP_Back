package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.Status;
import com.sd.project.repository.StatusRepository;

public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusRepository statusRepository;
    @Override
    public Status save(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public Status findByIdStatus(Long id) {
        return statusRepository.findById(id).orElse(null);
    }

    @Override
    public List<Status> findAllStatus() {
        return statusRepository.findAll();
    }

    @Override
    public void deleteStatus(Long id) {
        statusRepository.deleteById(id);
    }
    
}
