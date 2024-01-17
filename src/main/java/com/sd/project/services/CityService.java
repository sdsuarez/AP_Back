package com.sd.project.services;


import java.util.List;

import com.sd.project.entity.City;



public interface CityService {
    public City save(City city);
    public City findByIdCity(Long id);
    public List<City> findAllCity();
    public void deleteCity(Long id);
}