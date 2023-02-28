package com.example.graduationproject.Controller;

import com.example.graduationproject.Domain.Country;
import com.example.graduationproject.Domain.Genre;
import com.example.graduationproject.Service.CountryService;
import com.example.graduationproject.Service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/genres")
public class GenreController {
    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }



    @PostMapping("/add")
    public String addGenre(@ModelAttribute Genre genre) {
        if (genre.getGenreId() == 0) {
            this.genreService.addGenre(genre);
        } else {
            this.genreService.updateGenre(genre);
        }
        return "redirect:/genres";
    }

    @GetMapping("/remove/{id}")
    public String removeGenre(@PathVariable int id) {
        this.genreService.removeGenre(id);
        return "redirect:/genres";
    }

    @GetMapping("/edit/{id}")
    public String updateGenre(@PathVariable int id, Model model) {
        model.addAttribute("genre", this.genreService.getGenreById(id));

        return "genres";
    }

    @GetMapping("/{id}")
    public String genreData(@PathVariable int id, Model model) {
        model.addAttribute("genre", this.genreService.getGenreById(id));
        return "genre";
    }
}

