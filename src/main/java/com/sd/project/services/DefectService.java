package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Defect;

public interface DefectService {
    public Defect save(Defect defect);
    public Defect findByIdDefect(long id);
    public List<Defect> findAllDefect();
    public void deleteDefect(long id);
}
