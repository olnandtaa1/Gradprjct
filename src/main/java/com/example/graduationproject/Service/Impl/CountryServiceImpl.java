package com.example.graduationproject.Service.Impl;

import com.example.graduationproject.DAO.ArtistDAO;
import com.example.graduationproject.DAO.CountryDAO;
import com.example.graduationproject.Domain.Artist;
import com.example.graduationproject.Domain.Country;
import com.example.graduationproject.Service.CountryService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private CountryDAO countryDAO;

    public void setCountryDAO(CountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }

    @Override
    @Transactional
    public void addCountry(Country country) {
        this.countryDAO.addCountry(country);
    }

    @Override
    @Transactional
    public void updateCountry(Country country) {
        this.countryDAO.updateCountry(country);
    }

    @Override
    @Transactional
    public void removeCountry(int id) {
        this.countryDAO.removeCountry(id);
    }

    @Override
    public Country getACountryById(int id) {
        return this.countryDAO.getACountryById(id);
    }




}
