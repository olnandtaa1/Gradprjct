package com.example.graduationproject.Service;

import com.example.graduationproject.Domain.Country;

public interface CountryService {
    public void addCountry(Country country);
    public void updateCountry(Country country);
    public void removeCountry(int id);
    public Country getACountryById(int id);
}
