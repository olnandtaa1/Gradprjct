package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Album;
import com.example.graduationproject.Domain.Artist;

import java.util.List;

public interface ArtistDAO {
    public void addArtist(Artist artist);
    public void updateArtist(Artist artist);
    public void removeArtist(int id);
    public Artist getArtistById(int id);
    public List<Artist> listArtists();
}
