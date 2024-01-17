package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.project.entity.Country;
import com.sd.project.repository.CountryRepository;

@Service
public class CountryServiceImpl  implements CountryService {
    
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country findByIdCountry(Long id) {
        return countryRepository.findById(id).orElse(null); 
    }

    @Override
    public List<Country> findAllCountry() {
        return countryRepository.findAll();
    }

    @Override
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}
