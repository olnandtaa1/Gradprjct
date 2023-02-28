package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Artist;
import com.example.graduationproject.Domain.Country;

import java.util.List;

public interface CountryDAO {
    public void addCountry(Country country);
    public void updateCountry(Country country);
    public void removeCountry(int id);
    public Country getACountryById(int id);
}
