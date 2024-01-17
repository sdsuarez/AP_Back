package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Area;

public interface AreaService {
    public Area save(Area area);
    public Area findByIdArea(long id);
    public List<Area> findAllArea();
    public void deleteArea(long id);
}
