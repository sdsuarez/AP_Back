package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.QualityTest;



public interface QualityTestService {
    public QualityTest save(QualityTest qualityTest);
    public QualityTest findByIdQualityTest(Long id);
    public List<QualityTest> findAllQualityTest();
    public void deleteQualityTest(Long id);
}
