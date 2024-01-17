package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Country;

public interface CountryService {
      public Country save(Country country);
    public Country findByIdCountry(Long id);
    public List<Country> findAllCountry();
    public void deleteCountry(Long id);
}
