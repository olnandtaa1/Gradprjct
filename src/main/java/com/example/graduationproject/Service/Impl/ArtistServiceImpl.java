package com.example.graduationproject.Service.Impl;

import com.example.graduationproject.DAO.AlbumDAO;
import com.example.graduationproject.DAO.ArtistDAO;
import com.example.graduationproject.Domain.Album;
import com.example.graduationproject.Domain.Artist;
import com.example.graduationproject.Service.ArtistService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class ArtistServiceImpl implements ArtistService {
    private ArtistDAO artistDAO;

    public void setArtistDAO(ArtistDAO artistDAO) {
        this.artistDAO = artistDAO;
    }

    @Override
    @Transactional
    public void addArtist(Artist artist) {
        this.artistDAO.addArtist(artist);
    }

    @Override
    @Transactional
    public void updateArtist(Artist artist) {
        this.artistDAO.updateArtist(artist);
    }

    @Override
    @Transactional
    public void removeArtist(int id) {
        this.artistDAO.removeArtist(id);
    }


    @Override
    @Transactional
    public Artist getArtistById(int id) {
        return this.artistDAO.getArtistById(id);
    }

    @Override
    @Transactional
    public List<Artist> listArtists() {
        return this.artistDAO.listArtists();
    }
}
