package com.example.graduationproject.Controller;

import com.example.graduationproject.Domain.Album;
import com.example.graduationproject.Domain.Artist;
import com.example.graduationproject.Service.AlbumService;
import com.example.graduationproject.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/artists")
public class ArtistController {
    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public String listArtists(Model model) {
        model.addAttribute("artist", new Artist());
        model.addAttribute("listArtist", this.artistService.listArtists());
        return "artists";
    }

    @PostMapping("/add")
    public String addArtist(@ModelAttribute Artist artist) {
        if (artist.getId() == 0) {
            this.artistService.addArtist(artist);
        } else {
            this.artistService.updateArtist(artist);
        }
        return "redirect:/artists";
    }

    @GetMapping("/remove/{id}")
    public String removeArtist(@PathVariable int id) {
        this.artistService.removeArtist(id);
        return "redirect:/artists";
    }

    @GetMapping("/edit/{id}")
    public String updateArtist(@PathVariable int id, Model model) {
        model.addAttribute("artist", this.artistService.getArtistById(id));
        model.addAttribute("listArtist", this.artistService.listArtists());
        return "artists";
    }

    @GetMapping("/{id}")
    public String artistData(@PathVariable int id, Model model) {
        model.addAttribute("artist", this.artistService.getArtistById(id));
        return "artist";
    }
}
