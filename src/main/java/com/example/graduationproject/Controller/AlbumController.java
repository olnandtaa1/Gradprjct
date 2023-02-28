package com.example.graduationproject.Controller;

import com.example.graduationproject.Domain.Album;
import com.example.graduationproject.Domain.Song;
import com.example.graduationproject.Service.AlbumService;
import com.example.graduationproject.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/albums")
public class AlbumController {
    private final AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping
    public String listAlbums(Model model) {
        model.addAttribute("album", new Album());
        model.addAttribute("listAlbum", this.albumService.listAlbums());
        return "artists";
    }

    @PostMapping("/add")
    public String addAlbum(@ModelAttribute Album album) {
        if (album.getAlbumId() == 0) {
            this.albumService.addAlbum(album);
        } else {
            this.albumService.updateAlbum(album);
        }
        return "redirect:/albums";
    }

    @GetMapping("/remove/{id}")
    public String removeAlbum(@PathVariable int id) {
        this.albumService.removeAlbum(id);
        return "redirect:/albums";
    }

    @GetMapping("/edit/{id}")
    public String updateAlbum(@PathVariable int id, Model model) {
        model.addAttribute("album", this.albumService.getAlbumById(id));
        model.addAttribute("listAlbum", this.albumService.listAlbums());
        return "albums";
    }

    @GetMapping("/{id}")
    public String albumData(@PathVariable int id, Model model) {
        model.addAttribute("album", this.albumService.getAlbumById(id));
        return "album";
    }
}