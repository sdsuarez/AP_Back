package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Status;

public interface StatusService {

    public Status save(Status status);
    public Status findByIdStatus(Long id);
    public List<Status> findAllStatus();
    public void deleteStatus(Long id);

}
