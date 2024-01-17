package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.project.entity.Area;
import com.sd.project.repository.AreaRepository;

@Service
public class AreaServiceImpl implements AreaService {


    @Autowired
    private AreaRepository areaRepository;
    @Override
    public Area save(Area area) {
        return areaRepository.save(area);
    }

    @Override
    public Area findByIdArea(long id) {
        return areaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Area> findAllArea() {
        return areaRepository.findAll();
    }

    @Override
    public void deleteArea(long id) {
        // TODO Auto-generated method stub
        areaRepository.deleteById(id);
    }
    
}
