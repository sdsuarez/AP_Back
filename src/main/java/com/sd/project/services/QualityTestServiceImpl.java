package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.QualityTest;
import com.sd.project.repository.QualityTestRepository;

public class QualityTestServiceImpl implements QualityTestService {

    @Autowired
    QualityTestRepository qualityTestRepository;
    @Override
    public QualityTest save(QualityTest qualityTest) {
        return qualityTestRepository.save(qualityTest);
        
    }

    @Override
    public QualityTest findByIdQualityTest(Long id) {
        return qualityTestRepository.findById(id).orElse(null);
    }

    @Override
    public List<QualityTest> findAllQualityTest() {
        return qualityTestRepository.findAll();
    }

    @Override
    public void deleteQualityTest(Long id) {
        qualityTestRepository.deleteById(id);
    }
    
}
