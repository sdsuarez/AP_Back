package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.Defect;
import com.sd.project.repository.DefectRepository;

public class DefectServiceImpl implements DefectService {

    @Autowired
    private DefectRepository defectRepository;
    @Override
    public Defect save(Defect defect) {
        return defectRepository.save(defect);
    }

    @Override
    public Defect findByIdDefect(long id) {
        
        return defectRepository.findById(id).orElse(null);
    }

    @Override
    public List<Defect> findAllDefect() {
        return defectRepository.findAll();
    }

    @Override
    public void deleteDefect(long id) {
        defectRepository.deleteById(id);
    }
    
}
