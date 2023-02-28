package com.example.graduationproject.Repository;

import com.example.graduationproject.Domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
//
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
