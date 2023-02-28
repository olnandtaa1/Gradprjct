package com.example.graduationproject.Controller;

import com.example.graduationproject.Domain.Artist;
import com.example.graduationproject.Domain.Country;
import com.example.graduationproject.Service.ArtistService;
import com.example.graduationproject.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/countries")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }



    @PostMapping("/add")
    public String addCountry(@ModelAttribute Country country) {
        if (country.getCountryId() == 0) {
            this.countryService.addCountry(country);
        } else {
            this.countryService.updateCountry(country);
        }
        return "redirect:/countries";
    }

    @GetMapping("/remove/{id}")
    public String removeCountry(@PathVariable int id) {
        this.countryService.removeCountry(id);
        return "redirect:/countries";
    }

    @GetMapping("/edit/{id}")
    public String updateCountry(@PathVariable int id, Model model) {
        model.addAttribute("country", this.countryService.getACountryById(id));

        return "countries";
    }

    @GetMapping("/{id}")
    public String countryData(@PathVariable int id, Model model) {
        model.addAttribute("country", this.countryService.getACountryById(id));
        return "country";
    }
}
