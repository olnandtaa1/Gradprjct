package com.example.graduationproject.Controller;

import com.example.graduationproject.Domain.Song;
import com.example.graduationproject.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/songs")
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public String listSongs(Model model) {
        model.addAttribute("song", new Song());
        model.addAttribute("listSong", this.songService.listSongs());
        return "books";
    }

    @PostMapping("/add")
    public String addSong(@ModelAttribute Song song) {
        if (song.getSongId() == 0) {
            this.songService.addSong(song);
        } else {
            this.songService.updateSong(song);
        }
        return "redirect:/songs";
    }

    @GetMapping("/remove/{id}")
    public String removeSong(@PathVariable int id) {
        this.songService.removeSong(id);
        return "redirect:/songs";
    }

    @GetMapping("/edit/{id}")
    public String updateSong(@PathVariable int id, Model model) {
        model.addAttribute("song", this.songService.getSongById(id));
        model.addAttribute("listSong", this.songService.listSongs());
        return "songs";
    }

    @GetMapping("/{id}")
    public String songData(@PathVariable int id, Model model) {
        model.addAttribute("song", this.songService.getSongById(id));
        return "song";
    }
}